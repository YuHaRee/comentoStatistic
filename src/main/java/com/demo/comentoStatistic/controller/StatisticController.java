package com.demo.comentoStatistic.controller;

import com.demo.comentoStatistic.dto.YearCountDto;
import com.demo.comentoStatistic.dto.deptMonthCountDto;
import com.demo.comentoStatistic.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StatisticController {

    @Autowired
    StatisticService statisticService;

    // 연
    @RequestMapping(value="/api/v1/logins/{year}", produces = "application/json")
    @ResponseBody
    public ResponseEntity<YearCountDto> getYearLoginCount(@PathVariable("year") String year){

        return ResponseEntity.ok(statisticService.getYearLogins(year));
    }

    // 연월
    @RequestMapping(value="/api/v1/logins/{year}/{month}", produces = "application/json")
    @ResponseBody
    public Object getYearMonthLoginCount(@PathVariable("year") String year, @PathVariable("month") String month){

        return ResponseEntity.ok(statisticService.getYearMonthLogins(year, month));
    }

    //연월일
    @RequestMapping(value = "api/v1/logins/{year}/{month}/{date}", produces = "application/json")
    @ResponseBody
    public Object getYearMonthDateLoginCount(@PathVariable("year") String year,
                                             @PathVariable("month") String month,
                                             @PathVariable("date") String day) {
        return ResponseEntity.ok(statisticService.getYearMonthDateLogins(year,month,day));
    }

    // 일 평균
    @RequestMapping(value = "api/v1/logins/avg", produces = "application/json")
    @ResponseBody
    public Object getDateAvgLoginCount() {
        return ResponseEntity.ok(statisticService.getDateAvgLoginCount());
    }

    // 휴일 제외
    @RequestMapping(value = "api/v1/logins/workday", produces = "application/json")
    @ResponseBody
    public Object getWorkdayLoginCount() {
        return ResponseEntity.ok(statisticService.getWorkdayLoginCount());
    }

    //부서별 월별
    @RequestMapping(value = "api/v1/logins/dept", produces = "application/json")
    @ResponseBody
    public ResponseEntity<List<deptMonthCountDto>> getDeptMonthLoginCount() {
        return ResponseEntity.ok(statisticService.getDeptMonthLoginCount());
    }
}