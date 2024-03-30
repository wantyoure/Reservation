package com.example.reservation.service;


import com.example.reservation.entity.Member;
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
        System.out.println(memberLoginDto.getMember_id());
        System.out.println(login.getMember_id());
        System.out.println(login.getName());

        if (memberLoginDto.getMember_id() == login.getMember_id()) {
            return login;
        } else  {
            return null;
        }
    }

        public MemberFindId findId(MemberFindId memberFindId) {
            return memberRepository.findId(memberFindId);
    }

    public MemberFindPw findPw(MemberFindPw memberFindPw) {
        MemberFindPw pw = memberRepository.findPw(memberFindPw);
        System.out.println(pw.getPassword());
        return pw;
    }

    public void memberUpdate(MemberUpdate memberUpdate) {
        memberRepository.memberUpdate(memberUpdate);
    }

    public void memberDelete(MemberDelete memberDelete) {
        memberRepository.memberDelete(memberDelete);
    }
}
