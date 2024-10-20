package ru.example.config;

import lombok.RequiredArgsConstructor;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.example.dto.ErrorDto;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
@RequiredArgsConstructor
public class ErrorHandler {
    private final static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDto> handleException(Exception exception) {
        HttpStatus status = HttpStatus.BAD_REQUEST;

        log.log(Level.WARNING, exception.getClass().toString());
        log.log(Level.WARNING, exception.getMessage());
        log.log(Level.WARNING, exception.getLocalizedMessage());
        return ResponseEntity
                .status(status)
                .body(new ErrorDto(exception.getClass().toString(), exception.getMessage()));
    }
}
