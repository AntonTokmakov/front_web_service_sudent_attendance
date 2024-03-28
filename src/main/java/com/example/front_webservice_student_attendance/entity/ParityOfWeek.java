package com.example.front_webservice_student_attendance.entity;

public record ParityOfWeek(Long id, String name) {
    public enum ParityWeekEnum {
        ЧЕТНАЯ,
        НЕЧЕТНАЯ
    }

}
