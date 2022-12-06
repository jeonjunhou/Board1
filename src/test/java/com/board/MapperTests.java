package com.board;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.board.dto.MemberDTO;
import com.board.mapper.MemberMapper;

@SpringBootTest
public class MapperTests {
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Test
	public void testInsert() {
		
		MemberDTO m1 = new MemberDTO();
		
		m1.setName("장발정");
		m1.setId("mr.jang");
		m1.setPhone("000-111-1212");
		
		System.out.println( m1 );
		memberMapper.insertMember(m1);
		
		System.out.println("-----------------------------------");
		System.out.println("레코드가 추가되었습니다.");
		System.out.println("-----------------------------------");
	}

}
