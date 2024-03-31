package com.example.reservation.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pay {

    private int pay_id;
    private String money;
    private int reservation_reservation_id;

    public Pay() {
    }

    public Pay(int pay_id, String money,int reservation_reservation_id) {
        this.pay_id = pay_id;
        this.money = money;
        this.reservation_reservation_id = reservation_reservation_id;
    }
}
