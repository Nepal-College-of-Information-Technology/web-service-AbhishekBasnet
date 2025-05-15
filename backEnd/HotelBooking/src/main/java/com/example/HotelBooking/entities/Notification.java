package com.example.HotelBooking.entities;


import com.example.HotelBooking.enums.NotificationType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.internal.bytebuddy.dynamic.loading.InjectionClassLoader;

import java.time.LocalDateTime;

@Entity
@Table(name = "notifications")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Subject;
    @NotBlank(message = "Recipient is required")
    private String recipient;
    private String body;

    @Enumerated(EnumType.STRING)
    private NotificationType type;

    private String bookingReference;
    private final LocalDateTime createdAt = LocalDateTime.now();

}

