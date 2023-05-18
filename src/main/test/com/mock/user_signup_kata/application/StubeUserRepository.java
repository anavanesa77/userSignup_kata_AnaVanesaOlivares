package com.mock.user_signup_kata.application;

import com.mock.user_signup_kata.infrastructure.UserRepository;
import com.mock.user_signup_kata.domain.User;

import java.util.ArrayList;
import java.util.List;

public class StubeUserRepository implements UserRepository {

    User usuarioConsultado;

    User userSaved;

    List<User> users = new ArrayList<>();

    @Override
    public List<User> getUserByEmail(User userABuscar) {
        this.usuarioConsultado = userABuscar;
        users.add(userABuscar);
        return users;
    }

    public void saverUser(User user) {
        this.userSaved = user;
    }

}
