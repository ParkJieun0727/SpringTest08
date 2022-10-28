package com.nubypaper.board.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.nubypaper.board.domain.BoardVO;

@Mapper
public interface BoardDao {
	void insert(BoardVO vo);
	void update(BoardVO vo);
	void delete(BoardVO vo);
	BoardVO getBoard(BoardVO vo);
	List<BoardVO> getBoardList(BoardVO vo);
	
	void cnt(BoardVO vo);
}
