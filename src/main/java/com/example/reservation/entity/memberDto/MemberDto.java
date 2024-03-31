package com.example.reservation.entity.memberDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDto {

    private String name;
    private String gender;
    private int age;
    private String id;
    private int password;
    private String address;
    private int phone;

    public MemberDto() {
    }

    public MemberDto(String name, String gender, int age, String id, int password, String address, int phone) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.password = password;
        this.address = address;
        this.phone = phone;
    }
}
