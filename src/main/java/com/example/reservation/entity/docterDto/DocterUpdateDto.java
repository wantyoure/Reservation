package com.example.reservation.entity.docterDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DocterUpdateDto {

    private int docterId;
    private int password;
    private String address;
    private int phone;

    public DocterUpdateDto() {
    }

    public DocterUpdateDto(int docterId, int password, String address, int phone) {
        this.docterId = docterId;
        this.password = password;
        this.address = address;
        this.phone = phone;
    }
}
