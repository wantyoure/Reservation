package com.example.reservation.repository;

import com.example.reservation.entity.docterDto.*;
import com.example.reservation.entity.memberDto.MemberUpdate;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DocterRepository {
    private final SqlSessionTemplate sql;
    public void save(DocterDto docterDto) {
        sql.insert("Docter.save", docterDto);


    }

    public void login(DocterLoginDto docterLoginDto) {
        sql.selectOne("Docter.login",docterLoginDto);
    }

    public DocterFindIdDto findId(DocterFindIdDto docterFindIdDto) {
        return sql.selectOne("Docter.findId", docterFindIdDto);
    }

    public void docterUpdate(DocterUpdateDto docterUpdateDto) {
        sql.update("Docter.update", docterUpdateDto);
    }

    public void docterDelete(DocterDeleteDto docterDeleteDto) {
        sql.delete("Docter.delete", docterDeleteDto);
    }
}
