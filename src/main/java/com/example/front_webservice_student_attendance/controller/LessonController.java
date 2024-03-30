package com.example.front_webservice_student_attendance.controller;

import com.example.front_webservice_student_attendance.dto.SetPassActualLessonGroupStudy;
import com.example.front_webservice_student_attendance.entity.ActualLesson;
import com.example.front_webservice_student_attendance.entity.Lesson;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/lessons")
public class LessonController {

        private final LessonRestClient lessonRestClient;

    @GetMapping("/weekday/{day}")
    public String getActualLessonsByGroupAndWeek(@PathVariable("day") int day,
                                                 Model model) {

        List<ActualLesson> actualLessons = lessonRestClient.getActualLessonsByGroupAndWeek(day);
        model.addAttribute("actualLessons", actualLessons);
        return "lessons.weekday.day";
    }
    @GetMapping("/weekday/attendance/{lessonId}")
    public String getActualLessonsById(@PathVariable("lessonId") int lessonId,
                                       Model model) {

        SetPassActualLessonGroupStudy passList = lessonRestClient.getActualLessonsById(lessonId);
        model.addAttribute("passList", passList);
        return "lessons.monitor.weekday.attendance";
    }

}
