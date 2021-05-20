package com.lin.s2.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.lin.s2.board.BoardService;
import com.lin.s2.board.BoardVO;
import com.lin.s2.util.Pager;

@Service
public class NoticeService implements BoardService {

	@Autowired
	private NoticeMapper noticeMapper;
	
	//
	@Override
	public List<BoardVO> getList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	//인터페이스 구현 오버라이드 
	@Override
	public BoardVO getSelect(BoardVO boardVO) throws Exception {
		
		return noticeMapper.getList(boardVO);
	}

	@Override
	public int setInsert(BoardVO boardVO) throws Exception {
		
		return 0;
	}

	@Override
	public int setUpdate(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setDelete(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
	
}
