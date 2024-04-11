package com.example.reservation.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Docter {

    private int docterId;
    private String name;
    private String gender;
    private int age;
    private String id;
    private int password;
    private String address;
    private int phone;
    private int majorId;

    public Docter() {
    }

    public Docter(int docterId, String name, String gender, int age, String id, int password, String address, int phone, int majorId) {
        this.docterId = docterId;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.majorId = majorId;
    }
}
