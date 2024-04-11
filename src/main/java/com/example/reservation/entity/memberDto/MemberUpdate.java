package com.example.reservation.entity.memberDto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberUpdate {
    private int memberId;
    private int password;
    private String address;
    private int phone;

    public MemberUpdate() {
    }

    public MemberUpdate(int memberId,int password, String address, int phone) {
        this.memberId = memberId;
        this.password = password;
        this.address = address;
        this.phone = phone;
    }
}
