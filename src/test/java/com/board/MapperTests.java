package com.board;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.board.dto.BoardDTO;
import com.board.dto.MemberDTO;
import com.board.mapper.BoardMapper;

@SpringBootTest
public class MapperTests {
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Test
	public void testInsert() {
		
		//MemberDTO m1 = new MemberDTO();
		BoardDTO b1 = new BoardDTO();
		
		//m1.setName("장발정");
		//m1.setId("mr.jang");
		//m1.setPhone("000-111-1212");
		
		b1.setTitle("안녕하세요.반갑습니다.");
		b1.setContent("첫 테스트 글 입니다. 잘들어갔나요???");
		
		System.out.println( b1 );
		boardMapper.insertBoard(b1);
		
		System.out.println("-----------------------------------");
		System.out.println("레코드가 추가되었습니다.");
		System.out.println("-----------------------------------");
	}

}
