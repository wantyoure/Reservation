package com.example.reservation.entity.docterDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DocterLoginDto {

    private String id;
    private int password;

    public DocterLoginDto() {
    }

    public DocterLoginDto(String id, int password) {
        this.id = id;
        this.password = password;
    }
}
