package com.board.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.board.dto.MemberDTO;

@Mapper
public interface MemberMapper {

	public void insertMember( MemberDTO memberDTO );
}
