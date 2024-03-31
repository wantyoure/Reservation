package com.example.reservation.entity.memberDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDeleteDto {

    private int member_id;
    private int password;

    public MemberDeleteDto() {
    }

    public MemberDeleteDto(int member_id, int password) {
        this.member_id = member_id;
        this.password = password;
    }
}
