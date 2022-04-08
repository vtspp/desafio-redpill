package br.com.github.vtspp.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class UserDTO implements Serializable {

    private String name;

    private String identifier;

    private String identifierType;

}