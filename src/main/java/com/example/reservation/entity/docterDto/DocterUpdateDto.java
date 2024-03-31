package com.example.reservation.entity.docterDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DocterUpdateDto {

    private int docter_id;
    private int password;
    private String address;
    private int phone;

    public DocterUpdateDto() {
    }

    public DocterUpdateDto(int docter_id, int password, String address, int phone) {
        this.docter_id = docter_id;
        this.password = password;
        this.address = address;
        this.phone = phone;
    }
}
