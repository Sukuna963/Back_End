package com.example.CrudRestApi.repository;

import com.example.CrudRestApi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
