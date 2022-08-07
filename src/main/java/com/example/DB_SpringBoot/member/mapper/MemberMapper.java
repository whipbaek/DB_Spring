package com.example.DB_SpringBoot.member.mapper;

import com.example.DB_SpringBoot.member.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    public List<MemberDTO> getMembers();
}
