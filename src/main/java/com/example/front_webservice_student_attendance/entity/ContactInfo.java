package com.example.front_webservice_student_attendance.entity;

import jakarta.validation.constraints.NotNull;

public record ContactInfo(Long id,
                          @NotNull
                          TypeContactInfo typeContact,
                          @NotNull
                          GeneralContactInfo generalContactInfo,
                          @NotNull
                          String contactInfo) {
}
