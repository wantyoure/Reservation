package com.example.reservation.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/docter")
@RestController
@Slf4j
@Tag(name = "Docter" ,description = "의사 API")
public class DocterController {

    @Tag(name = "Docter")
    @Operation(summary = "의사 회원가입" , description = "의사 회원가입을 합니다.", method = "GET")
    @GetMapping("/")
    public String save() {
        return "Ok";
    }


}
