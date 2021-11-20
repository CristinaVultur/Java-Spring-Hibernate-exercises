package com.example.lab6ex1.repository;

import com.example.lab6ex1.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class UserRepository {

    private List<User> userList = new ArrayList<>();
    Logger logger = LoggerFactory.getLogger(UserRepository.class);

    public UserRepository(){
        User u1 = new User(1, "Username1", "First1", "Last1", "email", "adress1", "comtact");
        User u2 = new User(2, "Username2", "First2", "Last2", "email", "adress1", "comtact");
        /*User u1 = User.builder()
                .id(1)
                .userName("Username1")
                .firstName("Last1")
                .lastname("First1")
                .email("email")
                .address("address")
                .contact("contact")
                .build();
        User u2 = User.builder()
                .id(2)
                .userName("Username2")
                .firstName("Last2")
                .lastname("First2")
                .email("email")
                .address("address")
                .contact("contact")
                .build();*/
        userList.add(u1);
        userList.add(u2);
    }

    public List<User> findAll(){
        logger.info("returning to user {}{}{}", userList, userList, userList);
        return userList;
    }

    public User save(User user){
        logger.info("saving user {}", user);
        userList.add(user);
        return user;
    }
    public void deleteById(int userId){
        logger.info("deliting user with id{}", userId);
        userList = userList.stream()
                .filter(u -> u.getId() != userId)
                .collect(Collectors.toList());
    }
    public Optional<User> findById(int userId){
        logger.info("RETRIVING USER BY ID", userId);
        return userList.stream()
                .filter(u -> u.getId() == userId)
                .findFirst();

    }
}
