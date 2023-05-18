package com.mock.user_signup_kata.application;

import com.mock.user_signup_kata.domain.User;
import com.mock.user_signup_kata.infrastructure.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class MockUserRepository implements UserRepository {

    User usuarioConsultado;

    User userSaved;

    List<User> users = new ArrayList<>();
    @Override
    public List<User> getUserByEmail(User userABuscar) {
        this.usuarioConsultado = userABuscar;
        return users;
    }

    public void saverUser(User user) {
        this.userSaved = user;
    }

    public boolean getUserByEmailHasBeenCalledWith(User user) {
        if(usuarioConsultado.equals(user)){
            return true;
        }
        return false;
    }

    public boolean saverUserHasBeenCalledWith(User user) {
        if (userSaved.equals(user)){
            return true;
        }
        return false;
    }
}
