package com.zup.zup.resources;

import com.zup.zup.entities.Address;
import com.zup.zup.repositories.CepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CepResource {

    @Autowired
    private CepRepository cepService;

    @GetMapping("/{cep}")
    public ResponseEntity<Address> getCep(@PathVariable String cep) {

        Address endereco = cepService.buscaEnderecoPorCep(cep);

        return endereco != null ? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build();
    }

}
