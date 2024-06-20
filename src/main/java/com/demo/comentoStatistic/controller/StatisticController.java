package com.demo.comentoStatistic.controller;

import com.demo.comentoStatistic.dto.YearCountDto;
import com.demo.comentoStatistic.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
                                             @PathVariable("date") String date) {
        return ResponseEntity.ok(statisticService.getYearMonthDateLogins(year,month,date));
    }

    // 일 평균
    @RequestMapping(value = "api/v1/logins/date-avg", produces = "application/json")
    @ResponseBody
    public Object getDateALoginCount() {
        return ResponseEntity.ok(statisticService.getDateAvgLoginCount());
    }
}