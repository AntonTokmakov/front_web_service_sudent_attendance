package com.example.front_webservice_student_attendance.controller;

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

        @GetMapping("/edit")
        public String getActualLessonsByGroupAndWeek(@RequestParam("day") int day,
                                                                 Model model) {

            List<ActualLesson> actualLessons = lessonRestClient.getActualLessonsByGroupAndWeek(day);
            model.addAttribute("actualLessons", actualLessons);
            List<Lesson> lessons = actualLessons.stream().map(ActualLesson::lesson).toList();
            model.addAttribute("lessons", lessons);

            return "lessons.weekday.day";
        }

        @GetMapping("/ww")
        public String getActualLessonsByGroupAndWeek() {
            return "lessons.weekday.day";
        }

}
