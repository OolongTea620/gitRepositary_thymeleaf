package com.lin.s2.board;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*@Getter 					//getter 메서드
@Setter						//setter 메서드
@ToString					//toString override
@NoArgsConstructor			//default 생성자
@AllArgsConstructor 		//모든 매개변수가 있는 생성자
@RequiredArgsConstructor 	//필수 매개변수만 있는 생성자 생성
@EqualsAndHashCode			//hash, equals 메서드
*/

@Data //getter과 setter를 lombok이 대신 해준다
public class BoardVO {
	
	//DTO 대신 VO : VO의 경우에는 
	private Long Num;
	private String title;
	private String writer;
	private String contents;
	private Date regDate;
	private Long hit;
}
