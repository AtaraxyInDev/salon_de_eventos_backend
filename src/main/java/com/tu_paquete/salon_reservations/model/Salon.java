// src/main/java/com/tu_paquete/model/Salon.java
package com.tu_paquete.salon_reservations.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "salons")
public class Salon {
    @Id
    private String id;
    private String name;
    private String location;
    private int capacity;
    private String eventType;
}
