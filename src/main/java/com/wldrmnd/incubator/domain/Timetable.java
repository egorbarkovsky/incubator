package com.wldrmnd.incubator.domain;

import java.util.ArrayList;
import java.util.List;

public class Timetable {
    private String year;
    private List<Month> months;

    public Timetable() {
        this.months = new ArrayList<>();
        this.year = "2020";
    }
}
