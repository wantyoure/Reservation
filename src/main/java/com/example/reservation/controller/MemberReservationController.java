package com.example.reservation.controller;

import com.example.reservation.entity.reservationDto.ReservationDto;
import com.example.reservation.entity.reservationDto.ReservationUpdateDto;
import com.example.reservation.service.ReservationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
@RequestMapping("/reservation")
@Slf4j
@RequiredArgsConstructor
@Tag(name ="Reservation API", description = "예약 서비스 API")

public class MemberReservationController {

    private final ReservationService reservationService;

    @PostMapping("/{member_member_id}/members")
    public String reservation(@PathVariable int member_member_id,
                              @RequestParam String symptom,
                              @RequestParam int docter_docter_id,
                              @RequestParam String money
                              ) {
        ReservationDto reservationDto = new ReservationDto(symptom,member_member_id,docter_docter_id,money);
        reservationService.save(reservationDto);
        return "예약이되었습니다.";
    }
    @PutMapping("/{member_member_id}/members")
    public String update(@PathVariable int member_member_id,
                         @RequestParam int reservation_id,
                         @RequestParam int docter_docter_id,
                         @RequestParam String symptom,
                         @RequestParam String money
                         ) {
        log.info("reservation_memberid log={}", member_member_id);
        ReservationUpdateDto reservationUpdateDto = new ReservationUpdateDto(member_member_id,reservation_id,
                docter_docter_id,
                symptom,money);
        reservationService.update(reservationUpdateDto);

        return "예약이 수정되었습니다.";
    }

}
