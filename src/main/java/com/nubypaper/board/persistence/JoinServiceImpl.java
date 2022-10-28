package com.nubypaper.board.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nubypaper.board.domain.JoinVO;

@Service
public class JoinServiceImpl implements JoinService {

	@Autowired
	private JoinDao  dao;
	
	@Override
	public List<JoinVO> join1() {
		
		return dao.join1();
	}

	@Override
	public List<JoinVO> join2(JoinVO vo) {
		
		return dao.join2(vo);
	}

	@Override
	public List<JoinVO> join3(JoinVO vo) {
		
		return dao.join3(vo);
	}

}
