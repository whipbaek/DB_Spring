package com.example.DB_SpringBoot.member.service;

import com.example.DB_SpringBoot.member.dto.MemberDTO;
import com.example.DB_SpringBoot.member.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {

    private final MemberMapper memberMapper;

    @Override
    public List<MemberDTO> getMembers() {
        return memberMapper.getMembers();
    }
}
