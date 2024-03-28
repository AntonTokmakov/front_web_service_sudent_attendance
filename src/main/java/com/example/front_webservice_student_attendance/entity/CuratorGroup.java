package com.example.front_webservice_student_attendance.entity;

import java.time.LocalDate;

public record CuratorGroup(Long id,
                          Teacher teacher,
                          StudyGroup studyGroup,
                          LocalDate date) {
}
