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
		
		b1.setTitle("두번째 테스트 입니다.");
		b1.setContent("제발 한번에 잘 들어가자");
		
		System.out.println( b1 );
		boardMapper.insertBoard(b1);
		
		System.out.println("-----------------------------------");
		System.out.println("레코드가 추가되었습니다.");
		System.out.println("-----------------------------------");
	}

}
