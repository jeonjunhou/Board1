package com.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.board.dto.BoardDTO;

@Service
public interface BoardService {

	public boolean insertBoard(BoardDTO boardDTO);
	public List<BoardDTO> getBoard();
}
