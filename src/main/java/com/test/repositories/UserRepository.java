package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
