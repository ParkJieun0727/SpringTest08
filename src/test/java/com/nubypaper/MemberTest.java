package com.nubypaper;


import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nubypaper.board.domain.MemberVO;
import com.nubypaper.board.domain.Role;
import com.nubypaper.board.persistence.MemberServiceImpl;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberTest {

	@Autowired
	private MemberServiceImpl  service;
	
	@Before
	public  void  insert() {
		MemberVO	vo = new MemberVO();
		vo.setId("admin");
		vo.setName("도우너");
		vo.setPassword("admin123");
		vo.setRole(Role.ROLE_ADMIN);
		vo.setEnabled("TRUE");
		service.insert(vo);
	}
	
	
	
	@Test
	public  void  select() {
		
		List<MemberVO> li=service.getMemberList(null);
		
		for(MemberVO m :li) {
		  System.out.println("==>" + m.toString());
		}
	}

	
}
