package com.example.reservation.entity;

import java.sql.Date;

public class Reservation {

    private int reservation_id;
    private String Symptom;
    private Date createAt;
    private Date createPaY;
    private int member_member_id;
    private int docter_docter_id;

    public Reservation() {
    }

    public Reservation(int reservation_id, String symptom, Date createAt, Date createPaY, int member_member_id, int docter_docter_id) {
        this.reservation_id = reservation_id;
        this.Symptom = symptom;
        this.createAt = createAt;
        this.createPaY = createPaY;
        this.member_member_id = member_member_id;
        this.docter_docter_id = docter_docter_id;
    }
}
