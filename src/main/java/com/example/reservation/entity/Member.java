package com.example.reservation.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {

    private int memberId;
    private String name;
    private String gender;
    private int age;
    private String id;
    private int password;
    private String address;
    private int phone;

    public Member() {
    }

    public Member(int memberId, String name, String gender, int age, String id, int password, String address, int phone) {
        this.memberId = memberId;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.password = password;
        this.address = address;
        this.phone = phone;
    }
}
