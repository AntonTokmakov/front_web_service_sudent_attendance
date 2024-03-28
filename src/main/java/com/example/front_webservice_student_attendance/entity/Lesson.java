package com.example.front_webservice_student_attendance.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.core.ParameterizedTypeReference;

import java.util.List;

@Builder
public record Lesson(Long id,
                     Discipline discipline,
                     Kafedra kafedra,
                     NumberLesson numberLesson,
                     Weekday weekday,
                     TypeContactInfo typeLesson,
                     ParityOfWeek parityWeek,
                     List<StudyGroup> studyGroupList,
                     List<Teacher> teacherList) {


}
