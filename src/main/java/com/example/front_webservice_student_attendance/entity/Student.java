package com.example.front_webservice_student_attendance.entity;

import java.time.LocalDate;

public record Student(Long id,
                      String firstName,
                      String lastName,
                      String otchestvo,
                      LocalDate birthday,
                      boolean isMonitor,
                      StudyGroup studyGroup) {
}
