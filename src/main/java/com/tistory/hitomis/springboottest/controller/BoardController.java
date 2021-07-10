package com.tistory.hitomis.springboottest.controller;

import com.tistory.hitomis.springboottest.domain.BoardVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class BoardController {

    public BoardController() {
        System.out.println("===> BoardController 생성");
    }

    @GetMapping("/hello")
    public String hello(String name) {
        return "Hello : "+name;
    }

    @GetMapping("/getBoard")
    public BoardVO getBoard() {
        BoardVO board = new BoardVO();
        board.setSeq(1);
        board.setTitle("제목");
        board.setWriter("테스터");
        board.setContent("테스트 내용");
        board.setCreateDate(new Date());
        board.setCnt(0);

        return board;
    }

    @GetMapping("/getBoardList")
    public List<BoardVO> getBoardList() {
        ArrayList<BoardVO> boardVOS = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            BoardVO boardVO = new BoardVO();
            boardVO.setSeq(1);
            boardVO.setTitle("제목");
            boardVO.setWriter("테스터");
            boardVO.setContent("테스트 내용");
            boardVO.setCreateDate(new Date());
            boardVO.setCnt(0);
            boardVOS.add(boardVO);
        }
        return boardVOS;
    }
}
