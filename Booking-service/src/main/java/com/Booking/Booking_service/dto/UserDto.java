package com.Booking.Booking_service.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
    private int nic;
    private String name;
    private int mobile;
    private String email;
}
