package com.board.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.board.dto.BoardDTO;

@Mapper
public interface BoardMapper {

	public void insertBoard(BoardDTO boardDTO);
	
}
