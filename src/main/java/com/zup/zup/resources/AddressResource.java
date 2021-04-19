package com.zup.zup.resources;


import com.zup.zup.entities.Address;
import com.zup.zup.entities.User;
import com.zup.zup.repositories.AddressRepository;
import com.zup.zup.repositories.UserRepository;
import com.zup.zup.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/address")
public class AddressResource {

    @Autowired
    private AddressService service;

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping
    public ResponseEntity<List<Address>> findAll(){
        List<Address> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Address adicionar(@RequestBody Address address){
        return addressRepository.save(address);
    }


    @GetMapping(value="/{id}")
    public ResponseEntity<Address> findById(@PathVariable Long id){
        Address obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
