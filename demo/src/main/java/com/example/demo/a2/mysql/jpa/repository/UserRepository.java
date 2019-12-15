package com.example.demo.a2.mysql.jpa.repository;

import com.example.demo.jpa.entity.User;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;

@Profile("!h2")
public interface UserRepository extends CrudRepository<User, Long> {
}
