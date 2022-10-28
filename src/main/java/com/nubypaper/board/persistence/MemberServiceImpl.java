package com.nubypaper.board.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nubypaper.board.domain.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberDao dao;

	@Override
	public void insert(MemberVO vo) {
		dao.insert(vo);
	}

	@Override
	public List<MemberVO> getMemberList(MemberVO vo) {
		return dao.getMemberList(vo);
	}
}
