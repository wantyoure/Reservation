package com.example.reservation.controller;


import com.example.reservation.domain.Member;
import com.example.reservation.service.MemberService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/member")
@RestController
@Slf4j
@RequiredArgsConstructor
@Tag( name ="Member", description = "회원 API")

public class MemberController {

    private final MemberService memberService;

    @GetMapping("/save")
    public String save(@ModelAttribute Member member) {
        log.info("Member log={}", member);
        memberService.save(member);
        return "Ok";
    }


}
