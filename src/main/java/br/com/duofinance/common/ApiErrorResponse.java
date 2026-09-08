package br.com.duofinance.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.validation.FieldError;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record ApiErrorResponse(String code, String message, List<FieldError> fields) {
    public ApiErrorResponse(String code, String message) {
        this(code, message, null);
    }

    public record FieldErrorDetail(String code, String message) {
    }
}
