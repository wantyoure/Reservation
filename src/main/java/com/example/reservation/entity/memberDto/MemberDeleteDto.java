package com.example.reservation.entity.memberDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDeleteDto {

    private int memberId;
    private int password;

    public MemberDeleteDto() {
    }

    public MemberDeleteDto(int memberId, int password) {
        this.memberId = memberId;
        this.password = password;
    }
}
