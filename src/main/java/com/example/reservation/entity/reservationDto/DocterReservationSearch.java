package com.example.reservation.entity.reservationDto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class DocterReservationSearch {

    private int docterId;
    private String name;
    private String gender;
    private int age;
    private String address;
    private int phone;
    private String symptom;
    private Date createAt;
    private String money;

    public DocterReservationSearch() {
    }

    public DocterReservationSearch(int docterId, String name, String gender, int age, String address, int phone, String symptom, Date createAt, String money) {

        this.docterId = docterId;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.symptom = symptom;
        this.createAt = createAt;
        this.money = money;
    }
}
