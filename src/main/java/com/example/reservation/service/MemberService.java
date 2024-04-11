package com.example.reservation.service;


import com.example.reservation.entity.memberDto.*;
import com.example.reservation.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService {

    private final MemberRepository memberRepository;

    public void save(MemberDto memberDto) {
        memberRepository.save(memberDto);
    }

    public MemberLoginDto login(MemberLoginDto memberLoginDto) {
        MemberLoginDto login = memberRepository.login(memberLoginDto);

        if (memberLoginDto.getMemberId() == login.getMemberId()) {
            return login;
        } else  {
            return null;
        }
    }

        public MemberFindIdDto findId(MemberFindIdDto memberFindId) {
            return memberRepository.findId(memberFindId);
    }

    public MemberFindPwDto findPw(MemberFindPwDto memberFindPw) {
        MemberFindPwDto pw = memberRepository.findPw(memberFindPw);
        System.out.println(pw.getPassword());
        return pw;
    }

    public void memberUpdate(MemberUpdateDto memberUpdate) {
        memberRepository.memberUpdate(memberUpdate);
    }

    public void memberDelete(MemberDeleteDto memberDelete) {
        memberRepository.memberDelete(memberDelete);
    }
}
