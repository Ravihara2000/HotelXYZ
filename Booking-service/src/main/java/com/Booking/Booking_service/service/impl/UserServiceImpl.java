package com.Booking.Booking_service.service.impl;

import com.Booking.Booking_service.dto.UserDto;
import com.Booking.Booking_service.model.Users;
import com.Booking.Booking_service.repository.UserRepo;
import com.Booking.Booking_service.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public String addUser(UserDto userDto) {
        Users users = modelMapper.map(userDto,Users.class);
        userRepo.save(users);
        return users.getName()+"successfully saved";
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<Users> users=userRepo.findAll();
        List<UserDto> userDtos = modelMapper.map(users, List.class);
        return userDtos;
    }


}
