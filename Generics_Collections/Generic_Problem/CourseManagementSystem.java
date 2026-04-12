package com.gla.Generics_Collections.Generic_Problem;

import java.util.*;

abstract class CourseType {
    String typeName;
    CourseType(String typeName) {
        this.typeName = typeName;
    }
}

class ExamCourse extends CourseType {
    ExamCourse() {
        super("Exam");
    }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse() {
        super("Assignment");
    }
}

class ResearchCourse extends CourseType {
    ResearchCourse() {
        super("Research");
    }
}

class Course<T extends CourseType> {
    String courseName;
    T type;

    Course(String courseName, T type) {
        this.courseName = courseName;
        this.type = type;
    }
}

public class CourseManagementSystem {
    public static void showCourses(List<? extends CourseType> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).typeName);
        }
    }

    public static void main(String[] args) {
        List<ExamCourse> examList = new ArrayList<>();
        examList.add(new ExamCourse());
        examList.add(new ExamCourse());

        List<AssignmentCourse> assignList = new ArrayList<>();
        assignList.add(new AssignmentCourse());

        List<ResearchCourse> researchList = new ArrayList<>();
        researchList.add(new ResearchCourse());

        showCourses(examList);
        showCourses(assignList);
        showCourses(researchList);
    }
}
