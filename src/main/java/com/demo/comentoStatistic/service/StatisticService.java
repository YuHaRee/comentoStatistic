package com.demo.comentoStatistic.service;

import com.demo.comentoStatistic.dao.StatisticMapper;
import com.demo.comentoStatistic.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public dateAvgCountDto getDateAvgLoginCount() {
        return statisticMapper.selectDateAvgLoginCount();
    }

    public workdayDto getWorkdayLoginCount() {
        return statisticMapper.selectWorkdayLoginCount();
    }

    public List<deptMonthCountDto> getDeptMonthLoginCount() {
        return statisticMapper.selectDeptMonthLoginCount();
    }
}