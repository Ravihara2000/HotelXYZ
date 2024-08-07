package com.Booking.Booking_service.controller;

import com.Booking.Booking_service.dto.UserDto;
import com.Booking.Booking_service.service.UserService;
import com.Booking.Booking_service.utils.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add-user")
    public ResponseEntity<StandardResponse> addUser(@RequestBody UserDto userDto){
        String message = userService.addUser(userDto);
        return ResponseEntity.ok(new StandardResponse(200,  "successfully added user",message));
    }

    @GetMapping("get-all")
    public ResponseEntity<StandardResponse> getAllUsers(){
        List<UserDto> users = userService.getAllUsers();
        return ResponseEntity.ok(new StandardResponse(200, "success", users));
    }
}
