package day3.mapper;

import java.util.List;

import day3.dto.Money;

public interface MoneyTblMapper {

	void insert(Money money);
	List<Money> selectAll(); 
}
