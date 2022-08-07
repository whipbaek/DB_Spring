package com.example.DB_SpringBoot.member.controller;

import com.example.DB_SpringBoot.member.service.MemberService;
import com.example.DB_SpringBoot.member.dto.MemberDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/member")
    public List<MemberDTO> getMembers() {
        return memberService.getMembers();
    }

    @GetMapping("/hello")
    public String temp(){
        return "hello World";
    }
}
