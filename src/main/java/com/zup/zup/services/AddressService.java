package com.zup.zup.services;


import com.zup.zup.entities.Address;
import com.zup.zup.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository repository;

    public List<Address> findAll(){
        return repository.findAll();
    }

    public Address findById(Long id){
        Optional<Address> obj = repository.findById(id);
        return obj.get();
    }


}
