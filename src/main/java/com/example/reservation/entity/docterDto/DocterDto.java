package com.example.reservation.entity.docterDto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class DocterDto {

    private String name;
    private String gender;
    private int age;
    private String id;
    private int password;
    private String address;
    private int phone;
    private int major_major_id;

    public DocterDto() {
    }

    public DocterDto(String name, String gender, int age, String id, int password, String address, int phone, int major_major_id) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.major_major_id = major_major_id;
    }
}
