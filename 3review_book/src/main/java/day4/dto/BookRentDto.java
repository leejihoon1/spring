package day4.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder	//생성자 대신 프로퍼티값을 설정합니다 : 빌더 디자인 패턴
public class BookRentDto {

	private int rent_no;		// sequence 자동생성
	private int mem_idx;	
	private String bcode;
	private Date rent_date; 	//대여날짜 : sysdate
	private Date exp_date;		//반납기한날짜 = 대여날짜 + 14일, insert후에 update로 변경
	private Date return_date;	//실제 반납일
	private int delay_date;		//기본값 0
	
}
