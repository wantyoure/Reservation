package com.example.reservation.entity.memberDto;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;

@Getter
@Setter
public class MemberLoginDto {

    private int memberId;
    private int password;
    private String name;

    public MemberLoginDto() {
    }

    public MemberLoginDto(int memberId, int password, String name) {
        this.memberId = memberId;
        this.password = password;
        this.name = name;
    }
}
