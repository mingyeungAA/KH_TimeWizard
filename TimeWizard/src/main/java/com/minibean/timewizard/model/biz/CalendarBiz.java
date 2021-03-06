package com.minibean.timewizard.model.biz;

import java.util.List;

import com.minibean.timewizard.model.dto.CalendarDto;

public interface CalendarBiz {

	public int insertCalBoard(CalendarDto dto);
	public List<CalendarDto> getCalList(int user_no, String yyyymmdd );
	public List<CalendarDto> getViewList(int user_no, String yyyyMM);
	public int getViewCount(int user_no, String yyyyMMdd);
}
