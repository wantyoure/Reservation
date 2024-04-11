package com.example.reservation.entity;

import java.sql.Date;

public class Reservation {

    private int reservationId;
    private String Symptom;
    private Date createAt;
    private Date createPaY;
    private int memberId;
    private int docterId;

    public Reservation() {
    }

    public Reservation(int reservationId, String symptom, Date createAt, Date createPaY, int memberId, int docterId) {
        this.reservationId = reservationId;
        this.Symptom = symptom;
        this.createAt = createAt;
        this.createPaY = createPaY;
        this.memberId = memberId;
        this.docterId = docterId;
    }
}
