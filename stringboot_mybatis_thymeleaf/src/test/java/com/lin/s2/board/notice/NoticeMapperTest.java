package com.lin.s2.board.notice;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lin.s2.board.BoardVO;
import com.lin.s2.util.Pager;

@SpringBootTest
public class NoticeMapperTest {
	
	@Autowired
	private NoticeMapper noticeMapper;
	
	@Test
	void setInsertTest()throws Exception{

		for(int i=0;i<100;i++) {
			BoardVO boardVO = new BoardVO();
			boardVO.setTitle("title"+i);
			boardVO.setContents("contents"+i);
			boardVO.setWriter("writer"+i);
			noticeMapper.setInsert(boardVO);
		}
		System.out.println("Finish");
	}
	
	@Test
	void getListTest( Pager pager ) throws Exception {

		List<BoardVO> ar = noticeMapper.getList(pager);
		

		for(BoardVO boardVO:ar) {
			System.out.println(boardVO.toString());
		}

		System.out.println(ar.size());
		assertNotEquals(0, ar.size());

	}
}
