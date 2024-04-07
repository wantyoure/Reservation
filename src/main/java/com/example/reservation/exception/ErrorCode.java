package com.example.reservation.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;

@Getter
@AllArgsConstructor
public enum ErrorCode {


    TYPE_MISS_MATCH(CONFLICT,"타입이 안 맞습니다.");

    private final HttpStatus httpStatus;
    private final String detail;
}
