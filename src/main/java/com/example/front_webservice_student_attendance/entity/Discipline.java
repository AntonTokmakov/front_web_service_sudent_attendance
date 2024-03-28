package com.example.front_webservice_student_attendance.entity;

public record Discipline (Long id,
                          String name,
                          String shortName,
                          Kafedra kafedra) {
}
