package br.com.github.vtspp.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor (access = AccessLevel.PRIVATE)
public class StringUtil implements Serializable {

    public static boolean isNullOrEmpty (String str) {
        return str == null || str.trim().isEmpty();
    }
}