package com.example.cicdtest.service;

import com.example.cicdtest.dto.MemberRequest;
import com.example.cicdtest.model.Member;
import com.example.cicdtest.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public Member saveMember(MemberRequest memberRequest){
        Member member = Member.builder()
                .name(memberRequest.getName())
                .build();
        return memberRepository.save(member);
    }
}
