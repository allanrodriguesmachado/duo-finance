package br.com.duofinance.common.exception;

import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {
    private final String code;

    public BusinessException(String code, String message, Throwable cause) {
        super(message);
        this.code = code;
    }
}
