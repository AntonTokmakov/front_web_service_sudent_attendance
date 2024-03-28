package com.example.front_webservice_student_attendance.entity;

public record Pass(Long id,
                   ActualLesson actualLesson,
                   DocumentConfirm documentConfirm,
                   StatusPass statusPass,
                   Student student) {
}
