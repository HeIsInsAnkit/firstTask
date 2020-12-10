package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class restController {

    @Autowired
    private UserService userService;

    @GetMapping("/home")
    public String HomePage() {
        return "Welcome in Home page";
    }

    //get USER Details
    @GetMapping("/userDetails")
    public List<UserDetails> getUsers() {
        return userService.getUserDetails();
    }

    @PostMapping("/userDetails")
    public  UserDetails addUser(@RequestBody UserDetails userDetails) {
        return userService.addUser(userDetails);
    }

    @PutMapping("/userDetails")
    public UserDetails updateUser(@RequestBody UserDetails userDetails) {
        return  userService.updateUser(userDetails);
    }

    @DeleteMapping("/userDetails/{userId}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable String userId) {
        try {
            userService.deleteUser(Long.parseLong(userId));
            return  new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
