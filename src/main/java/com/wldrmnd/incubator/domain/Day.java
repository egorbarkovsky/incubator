package com.wldrmnd.incubator.domain;

public class Day {
    private int dayNum;
    private String lessonTime;
    private String linkToTheme;

    public int getDayNum() {
        return dayNum;
    }

    public void setDayNum(int dayNum) {
        this.dayNum = dayNum;
    }

    public String getLessonTime() {
        return lessonTime;
    }

    public void setLessonTime(String lessonTime) {
        this.lessonTime = lessonTime;
    }

    public String getLinkToTheme() {
        return linkToTheme;
    }

    public void setLinkToTheme(String linkToTheme) {
        this.linkToTheme = linkToTheme;
    }

    public Day(int dayNum, String lessonTime, String linkToTheme) {
        this.dayNum = dayNum;
        this.lessonTime = lessonTime;
        this.linkToTheme = linkToTheme;
    }
}