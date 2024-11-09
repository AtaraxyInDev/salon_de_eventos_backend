package com.tu_paquete.salon_reservations.controller;

import com.tu_paquete.salon_reservations.model.Salon;
import com.tu_paquete.salon_reservations.service.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/salons")
public class SalonController {
    @Autowired
    private SalonService salonService;

    @GetMapping
    public List<Salon> getAllSalons() {
        return salonService.getAllSalons();
    }

    @PostMapping public Salon createSalon(@RequestBody Salon salon) { 
        return salonService.saveSalon(salon); }
    }

// Otros métodos... }