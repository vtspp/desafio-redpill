package br.com.github.vtspp.handler;

import br.com.github.vtspp.exception.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestControllerAdvice
public class HandlerException implements Serializable {

    @ExceptionHandler (value = BusinessException.class)
    public final ResponseEntity<ResponseHandler> userManagerExceptionHandler (BusinessException e, HttpServletRequest request) {
        final Instant instantInTime = Instant.now();
        final long timeStamp = instantInTime.toEpochMilli();
        final LocalDateTime naw = LocalDateTime.ofInstant(instantInTime, ZoneId.systemDefault());
        final ResponseHandler response = ResponseHandler.builder()
                .path(request.getRequestURI())
                .status(HttpStatus.BAD_REQUEST.value())
                .message(e.getMessage())
                .timeStamp(timeStamp)
                .instant(naw)
                .build();
        return ResponseEntity.badRequest().body(response);
    }
}