package com.example.reservation.repository;


import com.example.reservation.domain.Member;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final SqlSessionTemplate sql;
    public void save(Member member) {
        sql.insert("Member.save",member);
    }
}
