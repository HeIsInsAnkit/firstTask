package com.example.demo;

import java.util.List;

public interface UserService {

    List<UserDetails> getUserDetails();

    UserDetails addUser(UserDetails userDetails);

    UserDetails updateUser(UserDetails userDetails);

    void deleteUser(long userId);

}
