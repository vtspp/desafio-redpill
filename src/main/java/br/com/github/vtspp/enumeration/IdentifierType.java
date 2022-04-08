package br.com.github.vtspp.enumeration;

import br.com.github.vtspp.exception.BusinessException;
import lombok.AllArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor
public enum IdentifierType {

    CPF (11, "CPF"),
    CNPJ (14, "CNPJ");

    private final int size;

    private final String description;

    public static String description (int size) throws BusinessException{
        return Arrays.stream(IdentifierType.values())
                .filter(identifierType -> identifierType.size == size)
                .findFirst()
                .orElseThrow(() -> new BusinessException("Identifier type not found"))
                .description;
    }
}