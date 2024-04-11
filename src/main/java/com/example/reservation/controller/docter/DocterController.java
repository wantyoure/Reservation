package com.example.reservation.controller.docter;

import com.example.reservation.entity.docterDto.*;
import com.example.reservation.service.DocterService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/docters")
@RestController
@Slf4j
@RequiredArgsConstructor
@Tag(name = "Docter" ,description = "의사 API")
public class DocterController {

    private final DocterService docterService;

    @Tag(name = "Docter")
    @Operation(summary = "의사 회원가입" , description = "의사 회원가입을 합니다.", method = "POST")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공",
                    content = {@Content(schema = @Schema(implementation = DocterDto.class))}),
            @ApiResponse(responseCode = "404", description = "실패")
    })
    @PostMapping()
    public String save(@ModelAttribute DocterDto docterDto) {
        docterService.save(docterDto);
        log.info("docter log={}", docterDto);
        return "회원가입이 완료되었습니다.";
    }

    @Tag(name = "Docter")
    @Operation( summary = "의사 로그인", description = "의사 로그인합니다." , method = "POST")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공",
                    content = {@Content(schema = @Schema(implementation = DocterLoginDto.class))}),
            @ApiResponse(responseCode = "404", description = "해당 ID의 유저가 존재하지 않습니다."),
    })
    @PostMapping("/login")
    public String login(@ModelAttribute DocterLoginDto docterLoginDto) {
        log.info("docterLogin log={}", docterLoginDto);
        docterService.login(docterLoginDto);
        return "로그인 완료되었습니다";
    }
    
    @Tag(name = "Docter")
    @Operation(summary = "의사 아이디 찾기", description = "의사 아아디 찾기입니다." , method = "GET")
    @ApiResponses(value =  {
            @ApiResponse(responseCode = "200", description = "성공",
            content = {@Content(schema = @Schema(implementation = DocterFindIdDto.class))}),
            @ApiResponse(responseCode = "404", description = "실패")
    })
    @GetMapping("/find/id")
    public String findId(@RequestParam String name,
                         @RequestParam int password) {
        DocterFindIdDto docterFindIdDto = new DocterFindIdDto();
        docterFindIdDto.setName(name);
        docterFindIdDto.setPassword(password);
        DocterFindIdDto findId = docterService.findId(docterFindIdDto);
        log.info("findId log={}", findId.getId());
        return findId.getId();
    }
    @Tag(name = "Docter")
    @Operation(summary = "의사정보 수정", description = "의사정보 수정입니다." , method = "PUT")
    @ApiResponses(value =  {
            @ApiResponse(responseCode = "200", description = "성공",
                    content = {@Content(schema = @Schema(implementation = DocterUpdateDto.class))}),
            @ApiResponse(responseCode = "404", description = "실패")
    })
    @PutMapping("/{docter_id}/myPage")
    public String docterUpdate(@PathVariable int docter_id,
                               @RequestParam int password,
                               @RequestParam String address,
                               @RequestParam int phone) {
        DocterUpdateDto docterUpdateDto = new DocterUpdateDto(docter_id,password,address,phone);
        log.info("memberUpdate log={}", password);
        docterService.docterUpdate(docterUpdateDto);
        return "업데이트가 완료되었습니다.";
    }
    @Tag(name = "Docter")
    @Operation(summary = "의사회원 탈퇴", description = "의사회원 탈퇴입니다." , method = "DELETE")
    @ApiResponses(value =  {
            @ApiResponse(responseCode = "200", description = "성공",
                    content = {@Content(schema = @Schema(implementation = DocterDeleteDto.class))}),
            @ApiResponse(responseCode = "404", description = "실패")
    })
    @DeleteMapping("/{docter_id}/myPage")
    public String docterUpdate(@PathVariable int docter_id,
                               @RequestParam int password) {
        DocterDeleteDto docterDeleteDto = new DocterDeleteDto(docter_id, password);
        docterService.docterDelete(docterDeleteDto);
        return "회원이 탈퇴되었습니다.";
    }
    @Tag(name = "Docter")
    @Operation(summary = "의사 로그아웃", description = "의사 로그아웃입니다." , method = "GET")
    @GetMapping("/logout")
    public String logout() {
        return "로그아웃 되었습니다.";
    }


}
