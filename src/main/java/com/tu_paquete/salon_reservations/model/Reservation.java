package com.tu_paquete.salon_reservations.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Data
@Document(collection = "reservations")
public class Reservation {
    @Id
    private String id;
    @DBRef
    private Salon salon;
    private Date date;
    private String userId;
    private boolean confirmed;
}