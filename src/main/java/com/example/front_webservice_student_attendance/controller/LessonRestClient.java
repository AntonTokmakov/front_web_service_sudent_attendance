package com.example.front_webservice_student_attendance.controller;

import com.example.front_webservice_student_attendance.entity.ActualLesson;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LessonRestClient {

    List<ActualLesson> getActualLessonsByGroupAndWeek(int day);

}
