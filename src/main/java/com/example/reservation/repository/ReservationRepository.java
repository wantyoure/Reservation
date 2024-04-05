package com.example.reservation.repository;


import com.example.reservation.entity.reservationDto.ReservationDto;
import com.example.reservation.entity.reservationDto.ReservationSearch;
import com.example.reservation.entity.reservationDto.ReservationUpdateDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Slf4j
public class ReservationRepository {
    private final SqlSessionTemplate sql;
    public void save(ReservationDto reservationDto) {
         sql.insert("Reservation.save", reservationDto);
    }

    public void update(ReservationUpdateDto reservationUpdateDto) {
        sql.update("Reservation.update", reservationUpdateDto);
    }

    public ReservationSearch select(ReservationSearch reservationSearch) {
        return sql.selectOne("Reservation.select", reservationSearch);
    }
}
