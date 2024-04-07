package com.example.reservation.controller.docter;

import com.example.reservation.entity.reservationDto.DocterReservationSearch;
import com.example.reservation.entity.reservationDto.ReservationUpdateDto;
import com.example.reservation.service.DocterService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reservation")
@Slf4j
@Tag(name = "DocterReservation", description = "의사 예약 확인 서비스 API")
public class DocterReservationController {

    private final DocterService docterService;

    @Tag(name = "DocterReservation")
    @Operation(summary = "의사 병원 환자 예약 확인",  description = "의사 병원 환자 예약 확인 서비스 ", method = "GET")
    @ApiResponses(value =  {
            @ApiResponse(responseCode = "200", description = "성공",
                    content = {@Content(schema = @Schema(implementation = ReservationUpdateDto.class))}),
            @ApiResponse(responseCode = "404", description = "실패")
    })
    @GetMapping("/{docter_id}/myPage")
    private List<DocterReservationSearch> reservationSearch(@PathVariable int docter_id) {
        DocterReservationSearch reservationSearch = new DocterReservationSearch();
        reservationSearch.setDocter_id(docter_id);
        List<DocterReservationSearch> searchList = docterService.select(reservationSearch);
        return searchList;
    }
}
