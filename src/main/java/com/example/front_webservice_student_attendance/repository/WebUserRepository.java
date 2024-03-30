package com.example.front_webservice_student_attendance.repository;

import com.example.front_webservice_student_attendance.entity.securityEntity.WebUser;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WebUserRepository extends JpaRepository<WebUser, Long> {

    Optional<WebUser> findByUsername(String username);
}
