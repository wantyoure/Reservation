package com.example.reservation.entity.memberDto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberUpdate {
    private int member_id;
    private int password;
    private String address;
    private int phone;

    public MemberUpdate() {
    }

    public MemberUpdate(int member_id,int password, String address, int phone) {
        this.member_id = member_id;
        this.password = password;
        this.address = address;
        this.phone = phone;
    }
}
