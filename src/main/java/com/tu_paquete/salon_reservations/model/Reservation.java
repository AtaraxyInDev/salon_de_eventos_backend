package com.tu_paquete.salon_reservations.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

// src/main/java/com/tu_paquete/salon_reservations/model/Reservation.java
@Data
@Document(collection = "reservations")
public class Reservation {
    @Id
    private String id;
    @DBRef
    private Salon salon;
    private Date date;
    private String userId;
    private String userName;  // Nuevo campo
    private String userEmail;  // Nuevo campo
    private String userPhone;  // Nuevo campo
    private int numberOfGuests;  // Nuevo campo
    private String eventDescription;  // Nuevo campo
    private String specialPreferences;  // Nuevo campo
    private boolean confirmed; 
}
