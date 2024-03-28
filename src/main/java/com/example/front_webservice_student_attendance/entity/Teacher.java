package com.example.front_webservice_student_attendance.entity;

import lombok.Builder;

import java.util.List;

@Builder
public record Teacher(Long id,
                      String firstName,
                      String secondName,
                      String otchestvo,
                      Kafedra kafedra,
                      List<Lesson> lessonList) {
}
