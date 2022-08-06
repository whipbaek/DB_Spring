package com.example.DB_SpringBoot.board.service;

import com.example.DB_SpringBoot.board.domain.BoardVO;
import com.example.DB_SpringBoot.board.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService {

    private final BoardMapper boardMapper;

    @Override
    public List<BoardVO> getBoards() {
        return boardMapper.getBoards();
    }
}
