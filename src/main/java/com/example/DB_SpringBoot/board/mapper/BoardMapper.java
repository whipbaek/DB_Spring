package com.example.DB_SpringBoot.board.mapper;

import com.example.DB_SpringBoot.board.domain.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    public List<BoardVO> getBoards();
}
