package com.example.reservation.entity.reservationDto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class DocterReservationSearch {

    private int docter_id;
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

    public DocterReservationSearch(int docter_id, String name, String gender, int age, String address, int phone, String symptom, Date createAt, String money) {

        this.docter_id = docter_id;
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
