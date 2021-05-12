package com.lin.s2.board;

import java.util.List;

import com.lin.s2.util.Pager;

public interface BoardMapper { //board가 추상 클래스,implement 뒤 확장해서 사용한다.
	
	//List
		public List<BoardVO> getList(Pager pager)throws Exception;
		//count
		public Long getTotalCount(Pager pager)throws Exception;
		//Select
		public BoardVO getSelect(BoardVO boardVO)throws Exception;
		//Insert
		public int setInsert(BoardVO boardVO)throws Exception;
		//Update
		public int setUpdate(BoardVO boardVO)throws Exception;
		//HitUpdate
		public int setHitUpdate(BoardVO boardVO)throws Exception;
		//Delete
		public int setDelete(BoardVO boardVO)throws Exception;
}
