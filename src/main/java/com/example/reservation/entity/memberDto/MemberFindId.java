package com.example.reservation.entity.memberDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberFindId {
    private String id;
    private String name;
    private int password;


    public MemberFindId() {
    }

    public MemberFindId(String id,String name,int password) {
        this.name = name;
        this.password = password;
        this.id = id;
    }
}
