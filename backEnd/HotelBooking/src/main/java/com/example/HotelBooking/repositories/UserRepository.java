package com.example.HotelBooking.repositories;

import com.example.HotelBooking.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;.

public class UserRepository extends JpaRepository<User, Long> {
}
