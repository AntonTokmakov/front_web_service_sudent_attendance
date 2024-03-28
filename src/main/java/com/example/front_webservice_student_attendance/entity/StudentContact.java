package com.example.front_webservice_student_attendance.entity;


public record StudentContact(Long id,
                             Student student,
                             TypeContactInfo contactInfo,
                             String contactDetails) {
}
