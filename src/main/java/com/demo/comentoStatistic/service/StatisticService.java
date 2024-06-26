package com.demo.comentoStatistic.service;

import com.demo.comentoStatistic.dao.StatisticMapper;
import com.demo.comentoStatistic.dto.*;
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

        return statisticMapper.selectYearMonthLogin(year + month);
    }

    public YearMonthDateCountDto getYearMonthDateLogins(String year, String month, String day) {

        return statisticMapper.selectYearMonthDateLogin(year + month + day);
    }

    public DateAvgCountDto getDateAvgLoginCount() {
        return statisticMapper.selectDateAvgCountLogin();
    }

    public workdayDto getworkdayLoginCount() {
        return statisticMapper.selectworkdayLoginCount();
    }
}