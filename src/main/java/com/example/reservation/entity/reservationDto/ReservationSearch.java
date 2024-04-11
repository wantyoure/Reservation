package com.example.reservation.entity.reservationDto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ReservationSearch {
    private int memberId;
    private String major;
    private Date  createAt;
    private String pay;


    public ReservationSearch() {

    }

    public ReservationSearch(int memberId, String major, Date createAt, String pay) {
        this.memberId = memberId;
        this.major = major;
        this.createAt = createAt;
        this.pay = pay;
    }
}
