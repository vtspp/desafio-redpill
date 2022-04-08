package br.com.github.vtspp.mapper;

import br.com.github.vtspp.domain.User;
import br.com.github.vtspp.dto.UserDTO;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class UserMapper implements Serializable {

    public User toMap (UserDTO dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setIdentifier(dto.getIdentifier());
        user.setIdentifierType(dto.getIdentifierType());
        return user;
    }

    public UserDTO toMap (User user) {
        return UserDTO.builder()
                .name(user.getName())
                .identifier(user.getIdentifier())
                .identifierType(user.getIdentifierType())
                .build();
    }
}