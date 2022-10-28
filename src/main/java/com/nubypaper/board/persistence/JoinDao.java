package com.nubypaper.board.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.nubypaper.board.domain.JoinVO;

@Mapper
public interface JoinDao {
  List<JoinVO>	join1();
  List<JoinVO>	join2(JoinVO vo);
  List<JoinVO>	join3(JoinVO vo);
}
