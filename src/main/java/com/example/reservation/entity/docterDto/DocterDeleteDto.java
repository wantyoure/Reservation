package com.example.reservation.entity.docterDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DocterDeleteDto {

    private int docter_id;
    private int password;

    public DocterDeleteDto() {
    }

    public DocterDeleteDto(int docter_id, int password) {
        this.docter_id = docter_id;
        this.password = password;
    }
}
