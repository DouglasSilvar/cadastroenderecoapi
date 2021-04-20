package com.zup.zup.resources;


import com.zup.zup.entities.User;
import com.zup.zup.repositories.UserRepository;
import com.zup.zup.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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
    @GetMapping(value="/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User adicionar(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("/consulta")
    public List<User> findPersonByName(@RequestParam("nome") String nome){
        return this.userRepository.findByNomeContains(nome)
                .stream()
                .map(User::converter)
                .collect(Collectors.toList());
    }
}
