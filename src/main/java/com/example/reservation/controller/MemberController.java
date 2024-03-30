package com.example.reservation.controller;


import com.example.reservation.entity.Member;
import com.example.reservation.entity.memberDto.*;
import com.example.reservation.service.MemberService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/members")
@RestController
@Slf4j
@RequiredArgsConstructor
@Tag( name ="Member", description = "회원 API")

public class MemberController {

    private final MemberService memberService;



    @Tag(name = "Member")
    @Operation( summary = "회원 로그인", description = "회원이 로그인합니다." , method = "POST")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공",
                    content = {@Content(schema = @Schema(implementation = MemberLoginDto.class))}),
            @ApiResponse(responseCode = "404", description = "해당 ID의 유저가 존재하지 않습니다."),
    })

    @PostMapping("/login")
    public MemberLoginDto login(@RequestParam int member_id,
                                @RequestParam int password) {
        log.info("Login member_id={},password={}", member_id, password);
        MemberLoginDto memberLoginDto = new MemberLoginDto();
        memberLoginDto.setMember_id(member_id);
        memberLoginDto.setPassword(password);
        MemberLoginDto login = memberService.login(memberLoginDto);
        return login;
    }

    @Tag(name = "Member")
    @Operation( summary = "회원가입", description = "회원이 가입합니다." , method = "POST")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공",
                    content = {@Content(schema = @Schema(implementation = MemberDto.class))}),
            @ApiResponse(responseCode = "404", description = "회원가입이 실패하였습니다."),
    })
    @PostMapping()
    public MemberDto save(@ModelAttribute MemberDto memberDto) {
        log.info("Member log={}", memberDto);
        memberService.save(memberDto);
        return memberDto;
    }

    @Tag(name ="Member")
    @Operation(summary ="회원 아이디 찾기", description = "회원의 아아디 찾기", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공",
            content = {@Content(schema = @Schema(implementation = MemberFindId.class))}),
            @ApiResponse(responseCode = "404", description = "회원 찾기에 실패했습니다.")
    })
    @GetMapping("/find/id")
    public String findId (@RequestParam String name,
                          @RequestParam int password) {
            MemberFindId memberFindId = new MemberFindId();
            memberFindId.setName(name);
            memberFindId.setPassword(password);
            log.info("member name={},password={}", name, password);
            MemberFindId id = memberService.findId(memberFindId);
            return id.getId();
    }

/*    @GetMapping("/find/pw") 이거 선생님한테 물어보기
    public MemberFindPw findPw (@RequestParam String id,
                       @RequestParam String address) {
        MemberFindPw memberFindPw = new MemberFindPw();
        memberFindPw.setId(id);
        memberFindPw.setAddress(address);
        MemberFindPw findPw = memberService.findPw(memberFindPw);
        log.info("member findPw={}",findPw.getPassword());
        return findPw;
    }*/

    @PutMapping("/{member_id}/myPage")
    public String memberUpdate(@PathVariable int member_id,
                               @RequestParam int password,
                               @RequestParam String address,
                               @RequestParam int phone) {
        MemberUpdate memberUpdate = new MemberUpdate(member_id,password,address,phone);
        log.info("memberUpdate log={}", password);
        memberService.memberUpdate(memberUpdate);
        return "업데이트가 완료되었습니다.";

    }

    @DeleteMapping("/{member_id}/myPage")
    public String memberDelete(@PathVariable int member_id,
                               @RequestParam int password) {
        MemberDelete memberDelete = new MemberDelete(member_id,password);
        memberService.memberDelete(memberDelete);
        return "회원 삭제가 완료되었습니다.";
    }

}
