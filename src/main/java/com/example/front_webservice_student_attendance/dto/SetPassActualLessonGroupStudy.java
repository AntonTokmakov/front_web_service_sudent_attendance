package com.example.front_webservice_student_attendance.dto;

import com.example.front_webservice_student_attendance.entity.ActualLesson;
import com.example.front_webservice_student_attendance.entity.Student;
import lombok.Builder;

import java.util.List;

@Builder
public record SetPassActualLessonGroupStudy
        (List<Student> studentList,
         ActualLesson actualLesson){

}
