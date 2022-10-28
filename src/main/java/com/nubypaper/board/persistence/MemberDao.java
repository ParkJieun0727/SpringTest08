package com.nubypaper.board.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.nubypaper.board.domain.MemberVO;

@Mapper
public interface MemberDao {

	void insert(MemberVO vo);
	List<MemberVO> getMemberList(MemberVO vo);
	
}
