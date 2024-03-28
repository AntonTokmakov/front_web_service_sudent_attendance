package com.example.front_webservice_student_attendance.config;

import com.example.front_webservice_student_attendance.controller.ClientRestLessonRestClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestClient;

@Configuration
public class ClientBeans {

    @Bean
    public ClientRestLessonRestClient clientRestLessonRestClient(
            @Value("http://localhost:8081") String url,
            @Value("student_attendance_user") String username,
            @Value("password") String password
            ) {
        return new ClientRestLessonRestClient(RestClient.builder()
                .baseUrl(url)
                .requestInterceptor(new BasicAuthenticationInterceptor(username, password))
                .build());
    }
}
