package com.example.reservation.entity.docterDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DocterDeleteDto {

    private int docterid;
    private int password;

    public DocterDeleteDto() {
    }

    public DocterDeleteDto(int docterId, int password) {
        this.docterid = docterId;
        this.password = password;
    }
}
