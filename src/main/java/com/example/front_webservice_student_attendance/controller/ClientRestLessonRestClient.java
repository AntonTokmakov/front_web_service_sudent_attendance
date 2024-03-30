package com.example.front_webservice_student_attendance.controller;

import com.example.front_webservice_student_attendance.dto.SetPassActualLessonGroupStudy;
import com.example.front_webservice_student_attendance.entity.ActualLesson;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.util.List;

@RequiredArgsConstructor
public class ClientRestLessonRestClient implements LessonRestClient{

    private static final ParameterizedTypeReference<List<ActualLesson>> ACTUAL_LESSON_LIST =
            new ParameterizedTypeReference<>() {

    };

    private final RestClient restClient;

    @Override
    public List<ActualLesson> getActualLessonsByGroupAndWeek(int day) {
        return restClient
                .get()
                .uri("/lessons/weekdays?day={day}", day)
                .retrieve()
                .body(ACTUAL_LESSON_LIST);
    }

    @Override
    public SetPassActualLessonGroupStudy getActualLessonsById(int lessonId) {
        return restClient
                .get()
                .uri("/monitor/student/pass?lessonId={lessonId}", lessonId)
                .retrieve()
                .body(SetPassActualLessonGroupStudy.class);
    }
}
