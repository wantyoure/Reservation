package com.example.reservation.repository;


import com.example.reservation.entity.Member;
import com.example.reservation.entity.memberDto.*;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.ResultHandler;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final SqlSessionTemplate sql;

    public void save(MemberDto memberDto) {
        sql.insert("Member.save",memberDto);
    }

    public MemberLoginDto login(MemberLoginDto memberLoginDto) {
        return sql.selectOne("Member.login", memberLoginDto);
    }

    public MemberFindId findId(MemberFindId memberFindId) {
        return sql.selectOne("Member.findId",memberFindId);
    }

    public MemberFindPw findPw(MemberFindPw memberFindPw) {
        return sql.selectOne("Member.findPw",memberFindPw);
    }

    public void memberUpdate(MemberUpdate memberUpdate) {
        sql.update("Member.update",memberUpdate);
    }

    public void memberDelete(MemberDelete memberDelete) {
        sql.delete("Member.delete",memberDelete);
    }
}
