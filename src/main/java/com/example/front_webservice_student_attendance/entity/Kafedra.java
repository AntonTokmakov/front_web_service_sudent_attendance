package com.example.front_webservice_student_attendance.entity;

public record Kafedra(Long id,
                      String name,
                      String shortName,
                      String office,
                      Institute institute,
                      GeneralContactInfo generalContactInfo) {
}

