package com.wldrmnd.incubator.domain;

import java.util.List;

public class Group {
    private Long id;
    private TeamLead teamLead;
    private List<Student> students;
    private Material material;
    private Timetable timetable;
    private int totalRating;

    public Group() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Timetable getTimetable() {
        return timetable;
    }

    public void setTimetable(Timetable timetable) {
        this.timetable = timetable;
    }

    public int getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(int totalRating) {
        this.totalRating = totalRating;
    }

    public Group(Long id, List<Student> students, Material material, Timetable timetable, int totalRating) {
        this.id = id;
        this.students = students;
        this.material = material;
        this.timetable = timetable;
        this.totalRating = totalRating;
    }

    private void calculateTotalRating() {
        for (Student student: students) {
            totalRating += student.getRating();
        }
    }
}
