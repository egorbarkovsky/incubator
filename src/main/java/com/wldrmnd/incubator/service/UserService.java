package com.wldrmnd.incubator.service;

import com.wldrmnd.incubator.model.User;
import com.wldrmnd.incubator.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User getUserByLogin(String login) {
        return userRepo.findByLogin(login).get();
    }
}
