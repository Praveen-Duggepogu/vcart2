package com.vcart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcart.entity.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
