package com.Booking.Booking_service.service;

import com.Booking.Booking_service.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    String addUser(UserDto userDto);

    List<UserDto> getAllUsers();
}
