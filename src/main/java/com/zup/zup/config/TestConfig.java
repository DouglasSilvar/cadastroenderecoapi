package com.zup.zup.config;



import com.zup.zup.entities.Address;
import com.zup.zup.entities.User;
import com.zup.zup.repositories.AddressRepository;
import com.zup.zup.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig  {
//    public class TestConfig implements CommandLineRunner {
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private AddressRepository addressRepository;
//
//
//    @Override
//    public void run(String... args) throws Exception {
//        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
//        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
//
//        Address o1 = new Address(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
//        Address o2 = new Address(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
//        Address o3 = new Address(null, Instant.parse("2019-07-22T15:21:22Z"), u1);
//
//        userRepository.saveAll(Arrays.asList(u1,u2));
//        addressRepository.saveAll(Arrays.asList(o1,o2,o3));
//
//    }
}