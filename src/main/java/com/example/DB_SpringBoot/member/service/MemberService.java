package com.example.DB_SpringBoot.member.service;

import com.example.DB_SpringBoot.member.dto.MemberDTO;

import java.util.List;

public interface MemberService {
    public List<MemberDTO> getMembers();
}
