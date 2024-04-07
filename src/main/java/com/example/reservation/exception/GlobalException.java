package com.example.reservation.exception;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jndi.TypeMismatchNamingException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalException {

    // 글로벌
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> customException(MethodArgumentNotValidException e) {
        final ErrorResponse response = ErrorResponse.toErrorResponse(ErrorCode.TYPE_MISS_MATCH);
        log.info("response log={}",response.toString());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

}
