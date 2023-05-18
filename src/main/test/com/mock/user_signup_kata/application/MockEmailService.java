package com.mock.user_signup_kata.application;

import com.mock.user_signup_kata.domain.User;
import com.mock.user_signup_kata.infrastructure.EmailService;

public class MockEmailService implements EmailService {

    String email;

    @Override
    public void sendEmail(User user) {
        this.email = user.getEmail();
    }

    public boolean sendEmailHasBeenCalledWith(User user) {
        if (email.equals(user.getEmail())) {
            return true;
        }
        return false;
    }
}
