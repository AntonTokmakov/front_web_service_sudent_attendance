package com.example.front_webservice_student_attendance.entity;

import java.time.LocalDate;

public record ActualLesson(Long id, Lesson lesson, LocalDate date) {

}
