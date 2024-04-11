package com.example.reservation.entity.reservationDto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ReservationUpdateDto {

    private int memberId;
    private int reservationId;
    private int docterId;
    private String symptom;
    private String money;

    public ReservationUpdateDto() {
    }

    public ReservationUpdateDto(int reservationId,int memberId, int docterId, String symptom, String money) {
        this.reservationId = reservationId;
        this.memberId = memberId;
        this.docterId = docterId;
        this.symptom = symptom;
        this.money = money;
    }
}
