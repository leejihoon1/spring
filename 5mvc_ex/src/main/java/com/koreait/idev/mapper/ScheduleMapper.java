package com.koreait.idev.mapper;

import java.util.List;

import com.koreait.idev.model.Schedule;

public interface ScheduleMapper {
	
	int insert(Schedule sch);
	List<Schedule> getSchedules(int mno);
	void delete(int idx);
	int checkMno(int idx);
}