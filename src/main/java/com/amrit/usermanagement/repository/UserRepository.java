package com.amrit.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amrit.usermanagement.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}