// src/main/java/com/tu_paquete/repository/ReservationRepository.java
package com.tu_paquete.salon_reservations.repository;

import com.tu_paquete.salon_reservations.model.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReservationRepository extends MongoRepository<Reservation, String> {}
