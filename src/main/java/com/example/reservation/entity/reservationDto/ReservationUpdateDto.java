package com.example.reservation.entity.reservationDto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ReservationUpdateDto {

    private int member_member_id;
    private int reservation_id;
    private int docter_docter_id;
    private String symptom;
    private String money;

    public ReservationUpdateDto() {
    }

    public ReservationUpdateDto(int reservation_id,int member_member_id, int docter_docter_id, String symptom, String money) {
        this.reservation_id = reservation_id;
        this.member_member_id = member_member_id;
        this.docter_docter_id = docter_docter_id;
        this.symptom = symptom;
        this.money = money;
    }
}
