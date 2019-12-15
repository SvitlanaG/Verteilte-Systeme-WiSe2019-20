package com.example.demo.a2.mysql.web.rest;

import com.example.demo.a2.mysql.service.UserService;
import com.example.demo.a2.mysql.web.model.UserModel;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Profile("!h2")
@RestController
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("user/{id}")
    public ResponseEntity<UserModel> getUser(@PathVariable Long id) {
        return ResponseEntity.ok(this.service.getUser(id));
    }

    @PostMapping("user")
    public ResponseEntity<UserModel> createUser(@RequestBody UserModel body) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(this.service.saveUser(body));
    }

    @PutMapping("user/{id}")
    public ResponseEntity<UserModel> updateUser(@PathVariable Long id, @RequestBody UserModel body) {
        return ResponseEntity.ok(this.service.updateUser(id, body));
    }

    @DeleteMapping("user/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id) {
        return ResponseEntity.ok(this.service.deleteUser(id));
    }
}
