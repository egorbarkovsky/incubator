package com.wldrmnd.incubator.domain;

import java.util.List;

public class Month {
    private String monthName;
    private List<Day> days;

    public Month() {
    }

    public Month(String monthName, List<Day> days) {
        this.monthName = monthName;
        this.days = days;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public List<Day> getDays() {
        return days;
    }

    public void setDays(List<Day> days) {
        this.days = days;
    }
}
