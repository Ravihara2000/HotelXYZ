package com.Booking.Booking_service.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
    private int nic;
    private String name;
    private int mobile;
    private String email;
}
