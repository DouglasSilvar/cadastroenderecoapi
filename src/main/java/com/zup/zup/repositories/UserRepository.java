package com.zup.zup.repositories;


import com.zup.zup.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByNomeContains(String nome);
}
