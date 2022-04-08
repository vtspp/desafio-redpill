package br.com.github.vtspp.handler;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
public class ResponseHandler implements Serializable {

    private final String path;

    private final int status;

    private final String message;

    private final long timeStamp;

    @JsonFormat (pattern = "yyyy-MM-dd HH:mm:ss")
    private final LocalDateTime instant;

}