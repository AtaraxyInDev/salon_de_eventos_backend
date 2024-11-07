// src/main/java/com/tu_paquete/repository/SalonRepository.java
package com.tu_paquete.salon_reservations.repository;

import com.tu_paquete.salon_reservations.model.Salon;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SalonRepository extends MongoRepository<Salon, String> {}
