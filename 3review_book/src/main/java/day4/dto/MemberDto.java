package day4.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {

	private int mem_idx;
	private String name;
	private String email; //unique, 로그인계정
	private String tel;
	private String password;
	
}
