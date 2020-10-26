package com.wldrmnd.incubator.domain;

public class Student extends Member {
    private StudentRole role;
    private int rating;

    public StudentRole getRole() {
        return role;
    }

    public void setRole(StudentRole role) {
        this.role = role;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
