package com.example.front_webservice_student_attendance.repository;

import com.example.front_webservice_student_attendance.entity.securityEntity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
}
