package com.example.HotelBooking.entities;


import com.example.HotelBooking.enums.RoomType;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.bridge.IMessage;

import java.math.BigDecimal;

@Entity
@Table(name = "rooms")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Room {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Min(value=1, message = "Room no must be at leat 1")
    @Column(unique = true)
    private Integer roomNumber;

    @Enumerated(EnumType.STRING)
    private RoomType type;

    @DecimalMin(value ="0.1", message ="Price per night is required")
    private BigDecimal pricePerNight;

    @Min(value = 1, message = "Capacity must be at least 1.")
    private Integer capacity;

    private String description;

    private String imageUrl;
}
