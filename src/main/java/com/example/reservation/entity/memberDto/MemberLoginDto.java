package com.example.reservation.entity.memberDto;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;

@Getter
@Setter
public class MemberLoginDto {

    private int member_id;
    private int password;
    private String name;

    public MemberLoginDto() {
    }

    public MemberLoginDto(int member_id, int password, String name) {
        this.member_id = member_id;
        this.password = password;
        this.name = name;
    }
}
