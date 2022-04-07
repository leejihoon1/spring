package day4.mapper;

import java.util.List;

import day4.dto.BookRentDto;

public interface BookRentMapper {

	int insert(BookRentDto dto);
	void updateExpDate(int rent_no);
	
	List<BookRentDto>selectAll();
	
}
