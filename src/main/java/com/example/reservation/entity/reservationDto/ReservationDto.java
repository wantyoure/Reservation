package com.example.reservation.entity.reservationDto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class ReservationDto {

    private String Symptom;
    private int member_member_id;
    private int docter_docter_id;
    private String money;

    public ReservationDto() {
    }

    public ReservationDto(String symptom, int member_member_id, int docter_docter_id, String money) {
        this.Symptom = symptom;
        this.member_member_id = member_member_id;
        this.docter_docter_id = docter_docter_id;
        this.money = money;
    }
}
