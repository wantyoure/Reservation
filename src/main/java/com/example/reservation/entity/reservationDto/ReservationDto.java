package com.example.reservation.entity.reservationDto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class ReservationDto {

    private String Symptom;
    private int memberId;
    private int docterId;
    private String money;

    public ReservationDto() {
    }

    public ReservationDto(String symptom, int memberId, int docterId, String money) {
        this.Symptom = symptom;
        this.memberId = memberId;
        this.docterId = docterId;
        this.money = money;
    }
}
