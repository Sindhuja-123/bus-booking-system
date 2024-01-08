package com.bus.demo.service;

import com.bus.demo.model.User;
import com.bus.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;

    @Override
    public boolean isAdmin(UUID userId) {
        Optional<User> user = userRepository.findById(userId);
        return user != null && "admin".equals(user.get().getRole());
    }
}
