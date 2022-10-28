package com.nubypaper.board.persistence;

import java.util.List;


import com.nubypaper.board.domain.MemberVO;

public interface MemberService {

	void insert(MemberVO vo);
	List<MemberVO> getMemberList(MemberVO vo);
}
