package br.com.github.vtspp.service.impl;

import br.com.github.vtspp.domain.User;
import br.com.github.vtspp.dto.UserDTO;
import br.com.github.vtspp.enumeration.IdentifierType;
import br.com.github.vtspp.exception.BusinessException;
import br.com.github.vtspp.mapper.UserMapper;
import br.com.github.vtspp.repository.UserRepository;
import br.com.github.vtspp.service.UserManager;
import br.com.github.vtspp.util.DocumentValidation;
import br.com.github.vtspp.util.StringUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor (onConstructor = @__(@Autowired))
public class UserService implements UserManager {

    private final UserRepository repository;

    private final UserMapper mapper;

    @Override
    public UserDTO register(UserDTO dto) throws BusinessException {
        this.containIdentifier(dto.getIdentifier());
        this.documentTypeDefinition(dto);
        User user = this.mapper.toMap(dto);
        return this.mapper.toMap(this.repository.save(user));
    }

    private void containIdentifier (String identifier) {
        if (StringUtil.isNullOrEmpty(identifier))
            throw new BusinessException ("Field 'identifier' is required");
    }

    private void documentTypeDefinition (UserDTO dto) throws BusinessException {
        String document = DocumentValidation.removeMaskFromDocument(dto.getIdentifier());
        if (DocumentValidation.isCpfCnpjValid(document))
            dto.setIdentifier(document);
            dto.setIdentifierType(IdentifierType.description(document.length()));
    }
}