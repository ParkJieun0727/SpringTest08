package com.nubypaper.board.persistence;

import java.util.List;

import com.nubypaper.board.domain.JoinVO;

public interface JoinService {
	  List<JoinVO>	join1();
	  List<JoinVO>	join2(JoinVO vo);
	  List<JoinVO>	join3(JoinVO vo);
}
