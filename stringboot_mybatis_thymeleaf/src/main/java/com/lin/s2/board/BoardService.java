package com.lin.s2.board;

import java.util.List;

import com.lin.s2.util.Pager;

public interface BoardService {

	//Select
	public BoardVO getSelect(BoardVO boardVO)throws Exception;
	
	//Insert
	public int setInsert(BoardVO boardVO)throws Exception;
	
	//Update
	public int setUpdate(BoardVO boardVO)throws Exception;

	//Delete
	public int setDelete(BoardVO boardVO)throws Exception;

	List<BoardVO> getList(Pager pager) throws Exception;
	
}
