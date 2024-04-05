package com.example.reservation.service;

import com.example.reservation.entity.reservationDto.ReservationDto;
import com.example.reservation.entity.reservationDto.ReservationSearch;
import com.example.reservation.entity.reservationDto.ReservationUpdateDto;
import com.example.reservation.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationService {

    private final ReservationRepository reservationRepository;


    public void save(ReservationDto reservationDto) {
        reservationRepository.save(reservationDto);
    }


    public void update(ReservationUpdateDto reservationUpdateDto) {
        reservationRepository.update(reservationUpdateDto);
    }

    public ReservationSearch select(ReservationSearch reservationSearch) {
        return reservationRepository.select(reservationSearch);
    }
}
