package com.example.front_webservice_student_attendance.entity;

import lombok.Builder;
import java.time.LocalDate;
import java.util.List;


@Builder
public record StudyGroup(Long id,
                         String name,
                         String shortName,
                         Integer groupSize,
                         Kafedra kafedra,
                         Specialization specialization,
                         LocalDate yearAdmission,
                         List<Lesson> lessonList) {


}
