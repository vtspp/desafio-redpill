package br.com.github.vtspp.service;

import br.com.github.vtspp.dto.UserDTO;
import br.com.github.vtspp.exception.BusinessException;

import java.io.Serializable;

public interface UserManager extends Serializable {

    UserDTO register (UserDTO dto) throws BusinessException;
}