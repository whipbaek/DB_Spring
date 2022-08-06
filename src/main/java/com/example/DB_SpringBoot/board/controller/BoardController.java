package com.example.DB_SpringBoot.board.controller;

import com.example.DB_SpringBoot.board.service.BoardService;
import com.example.DB_SpringBoot.board.domain.BoardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/v1/board")
    public List<BoardVO> getBoards() {
        return boardService.getBoards();
    }

    @GetMapping("/hello")
    public String temp(){
        return "hello World";
    }
}
