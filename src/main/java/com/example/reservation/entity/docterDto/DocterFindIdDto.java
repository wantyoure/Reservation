package com.example.reservation.entity.docterDto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DocterFindIdDto {

    private String name;
    private int password;
    private String id;

    public DocterFindIdDto() {
    }

    public DocterFindIdDto(String name, int password, String id) {
        this.name = name;
        this.password = password;
        this.id = id;
    }
}
