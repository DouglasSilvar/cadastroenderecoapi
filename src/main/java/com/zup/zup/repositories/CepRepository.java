package com.zup.zup.repositories;

import com.zup.zup.entities.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url= "https://viacep.com.br/ws/" , name = "viacep")
public interface CepRepository {

    @GetMapping("{cep}/json")
    Address buscaEnderecoPorCep(@PathVariable("cep") String cep);

}
