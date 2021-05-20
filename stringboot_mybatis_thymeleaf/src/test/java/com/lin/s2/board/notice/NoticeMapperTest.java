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
		System.out.println("Insert 완료");
	}
	
	@Test
	void getListTest( Pager pager ) throws Exception {

		List<BoardVO> ar = noticeMapper.getList(pager);

		for(BoardVO boardVO:ar) {
			//향상된 For문 
			System.out.println(boardVO.toString());
		}

		System.out.println(ar.size());
		assertNotEquals(0, ar.size()); // 10개 가지고 오고 싶은데 0이 아니였으면 좋겠다	
	}
}
