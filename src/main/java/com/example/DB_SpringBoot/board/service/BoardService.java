package com.example.DB_SpringBoot.board.service;

import com.example.DB_SpringBoot.board.domain.BoardVO;

import java.util.List;

public interface BoardService {
    public List<BoardVO> getBoards();
}
