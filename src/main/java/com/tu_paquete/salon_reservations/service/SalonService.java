// src/main/java/com/tu_paquete/service/SalonService.java
package com.tu_paquete.salon_reservations.service;

import com.tu_paquete.salon_reservations.model.Salon;
import com.tu_paquete.salon_reservations.repository.SalonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalonService {
    @Autowired
    private SalonRepository salonRepository;

    public List<Salon> getAllSalons() {
        return salonRepository.findAll();
    }

    public Salon saveSalon(Salon salon) {
        return salonRepository.save(salon);
    }

    // Otros métodos...
}
