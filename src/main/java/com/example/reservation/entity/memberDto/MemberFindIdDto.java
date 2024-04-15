package com.example.reservation.entity.memberDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberFindIdDto {
    private String id;
    private String name;
    private int password;


    public MemberFindIdDto() {
    }

    public MemberFindIdDto(String id, String name, int password) {
        this.name = name;
        this.password = password;
        this.id = id;
    }
}
