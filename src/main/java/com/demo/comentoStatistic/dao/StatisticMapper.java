package com.demo.comentoStatistic.dao;

import com.demo.comentoStatistic.dto.DateAvgCountDto;
import com.demo.comentoStatistic.dto.YearCountDto;
import com.demo.comentoStatistic.dto.YearMonthCountDto;
import com.demo.comentoStatistic.dto.YearMonthDateCountDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StatisticMapper {

    YearCountDto selectYearLogin(String year);
    YearMonthCountDto selectYearMonthLogin(String yearMonth);
    YearMonthDateCountDto selectYearMonthDateLogin(String yearMonth);
    DateAvgCountDto selectDateAvgCountLogin();
}