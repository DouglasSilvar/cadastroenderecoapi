package com.zup.zup.resources;


import com.zup.zup.entities.User;
import com.zup.zup.repositories.UserRepository;
import com.zup.zup.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User adicionar(@RequestBody User user){
        return userRepository.save(user);
    }




    @GetMapping(value="/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
