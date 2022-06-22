package com.example.cicdtest.controller;

import com.example.cicdtest.dto.MemberRequest;
import com.example.cicdtest.model.Member;
import com.example.cicdtest.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/api/member")
    public Member saveMember(@RequestBody MemberRequest memberRequest){
        return memberService.saveMember(memberRequest);
    }
}
