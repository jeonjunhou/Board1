package com.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.dto.BoardDTO;
import com.board.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	BoardService bservice;
	
	@GetMapping("/getboard")
	public String getBoard(Model model) {
		
		System.out.println("getAllBoard()");
		
		List<BoardDTO> list = bservice.getBoard();
		
		model.addAttribute("list", list);
		
		return "/board/mainboard";
	}
	
	@GetMapping("/goboardwrite")
	public String goBoardWrite() {
		
		System.out.println("goBoardWrite()");
		
		return "/board/boardwrite";
	}
	
	@PostMapping("/boardwrite")
	public String insertBoard(@RequestParam("formData") BoardDTO boardDTO) {
		
		System.out.println("insertBoard()");
		
		boolean b = bservice.insertBoard(boardDTO);
		
		if (b) {
			return "YES";
		} else {
			return "NO";
		}
	}
	
}
