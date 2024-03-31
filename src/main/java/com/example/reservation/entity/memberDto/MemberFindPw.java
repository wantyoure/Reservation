package com.example.reservation.entity.memberDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberFindPw {

    private String id;
    private String address;
    private int password;

    public MemberFindPw() {
    }

    public MemberFindPw(String id, String address, int password) {
        this.id = id;
        this.address = address;
        this.password = password;
    }
}
