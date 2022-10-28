package com.nubypaper.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nubypaper.board.domain.BoardVO;
import com.nubypaper.board.persistence.JoinServiceImpl;

@RequestMapping("/board/")
@Controller
public class BoardController {

	
	@Autowired
	JoinServiceImpl  joinService;
	
	@RequestMapping("/getBoardList.do")
	public String getBoardList(Model model, BoardVO  vo){
		System.out.println("=====>확인 !!!");
		model.addAttribute("li", joinService.join1());
		
		return "board/getBoardList";
		
	}
		
}
