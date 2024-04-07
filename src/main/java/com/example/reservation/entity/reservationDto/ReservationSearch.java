package com.example.reservation.entity.reservationDto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ReservationSearch {
    private int member_id;
    private String major;
    private Date  createAt;
    private String pay;


    public ReservationSearch() {

    }

    public ReservationSearch(int member_id, String major, Date createAt, String pay) {
        this.member_id = member_id;
        this.major = major;
        this.createAt = createAt;
        this.pay = pay;
    }
}
