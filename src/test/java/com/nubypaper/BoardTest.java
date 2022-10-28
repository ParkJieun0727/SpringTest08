package com.nubypaper;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nubypaper.board.domain.BoardVO;
import com.nubypaper.board.persistence.BoardServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTest {

	@Autowired
	private BoardServiceImpl  service;
	
	@Before
	public  void  insert() {
		for(int i=1; i <=5 ; i++) {
		BoardVO	vo=new BoardVO();
		vo.setTitle("도우너"+i+"입니다.");
		vo.setWriter("admin");
		vo.setContent("도우너 내용"+i+"");
		vo.setCreateDate(new Date());
		vo.setCnt(2);
		service.insert(vo);
		}
		
	}
	
	// @Before
	public  void  delete() {
		for (int i=1 ; i <= 10 ; i++ ) {
		BoardVO	vo=new BoardVO();
		vo.setSeq(1001 + i);
		service.delete(vo);
		}
		
	}
	
	@Test
	public  void  select() {
		
		List<BoardVO> li=service.getBoardList(null);
		
		for(BoardVO m :li) {
		  System.out.println("==>" + m.toString());
		}
	}

	
}
