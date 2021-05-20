package com.lin.s2.board.notice;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.lin.s2.board.BoardMapper;

//@Repository 이제는 이거 필수로 안써도 된다!
@Mapper //필수 
public interface NoticeMapper extends BoardMapper{
	
	//getList()패키지 명은 동일하게 맞춰준다
	//인터페이스로 만든다. 오버라이드 없이 스프링부트가 알아서 찾아가 준다. 
	//인터페이스이름과 동일한 Mapper명으로 찾아간다.
	
}