package com.example.reservation.repository;


import com.example.reservation.entity.reservationDto.ReservationDto;
import com.example.reservation.entity.reservationDto.ReservationUpdateDto;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ReservationRepository {
    private final SqlSessionTemplate sql;
    public void save(ReservationDto reservationDto) {
         sql.insert("Reservation.save", reservationDto);
    }

    public void update(ReservationUpdateDto reservationUpdateDto) {
        sql.update("Reservation.update", reservationUpdateDto);
    }
}
