package com.example.front_webservice_student_attendance.entity;

import java.time.LocalDate;

public record DocumentConfirm(Long id,
                              String name,
                              byte[] documentScan,
                              LocalDate startDate,
                              LocalDate endDate) {

}
