package com.example.board.controller;

import com.example.board.entity.Board;
import com.example.board.repository.BoardRepository;
import com.example.board.service.JiraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boards")
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private JiraService jiraService;

    @GetMapping
    public List<Board> getAllBoards() {
        return boardRepository.findAll();
    }

    @PostMapping
    public Board createBoard(@RequestBody Board board) {
        jiraService.simulateJiraCall("New board created: " + board.getTitle());
        return boardRepository.save(board);
    }
}