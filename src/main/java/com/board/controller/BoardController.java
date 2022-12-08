package com.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
	
}
