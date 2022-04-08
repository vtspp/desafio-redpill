package br.com.github.vtspp.resource.impl;

import br.com.github.vtspp.dto.UserDTO;
import br.com.github.vtspp.resource.UserResourceSpec;
import br.com.github.vtspp.service.impl.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (UserResourceSpec.PATH)
@RequiredArgsConstructor (onConstructor = @__(@Autowired))
public class UserResource implements UserResourceSpec {

    private final UserService service;

    @Override
    public ResponseEntity<UserDTO> register(UserDTO dto) {
        return ResponseEntity.ok(this.service.register(dto));
    }
}