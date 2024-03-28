package com.example.front_webservice_student_attendance.entity;

public record Institute(Long id,
                        String name,
                        String shortName,
                        String office,
                        GeneralContactInfo generalContactInfo) {
}
