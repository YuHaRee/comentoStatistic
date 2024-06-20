package com.demo.comentoStatistic.service;

import com.demo.comentoStatistic.dao.StatisticMapper;
import com.demo.comentoStatistic.dto.DateAvgCountDto;
import com.demo.comentoStatistic.dto.YearCountDto;
import com.demo.comentoStatistic.dto.YearMonthCountDto;
import com.demo.comentoStatistic.dto.YearMonthDateCountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatisticService {


    @Autowired
    StatisticMapper statisticMapper;

    public YearCountDto getYearLogins(String year){

        return statisticMapper.selectYearLogin(year);
    }

    public YearMonthCountDto getYearMonthLogins(String year, String month){

        return statisticMapper.selectYearMonthLogin(year+month);
    }

    public YearMonthDateCountDto getYearMonthDateLogins(String year, String month, String date) {

        return statisticMapper.selectYearMonthDateLogin(year + month + date);
    }

    public DateAvgCountDto getDateAvgLoginCount() {
        return statisticMapper.selectDateAvgCountLogin();
    }

}