package com.arun.project.uber.uberApp.services.Impl;

import com.arun.project.uber.uberApp.dto.DriverDto;
import com.arun.project.uber.uberApp.dto.SignupDto;
import com.arun.project.uber.uberApp.dto.UserDto;
import com.arun.project.uber.uberApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signUpDto) {
        return null;
    }

    @Override
    public DriverDto onBoardNewDriver(Long userId) {
        return null;
    }
}
