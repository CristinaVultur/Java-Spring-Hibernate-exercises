package com.example.lab6ex1.service;

import com.example.lab6ex1.model.User;
import com.example.lab6ex1.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public void deleteById(int userId){
        userRepository.deleteById(userId);
    }

    public User findById(int userId){
       return userRepository.findById(userId)
               .orElseThrow(() -> new RuntimeException("User was not found!"));

    }
}
