package com.demo.comentoStatistic.dao;

import com.demo.comentoStatistic.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StatisticMapper {

    YearCountDto selectYearLogin(String year);
    YearMonthCountDto selectYearMonthLogin(String yearMonth);
    YearMonthDateCountDto selectYearMonthDateLogin(String yearMonthDate);
    dateAvgCountDto selectDateAvgLoginCount();
    nHolidayDto selectNHolidayLoginCount();
    List<deptMonthCountDto> selectDeptMonthLoginCount();
}
