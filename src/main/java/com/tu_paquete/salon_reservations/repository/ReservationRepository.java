// src/main/java/com/tu_paquete/salon_reservations/repository/ReservationRepository.java
package com.tu_paquete.salon_reservations.repository;

import com.tu_paquete.salon_reservations.model.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ReservationRepository extends MongoRepository<Reservation, String> {
    List<Reservation> findBySalonId(String salonId);
}
