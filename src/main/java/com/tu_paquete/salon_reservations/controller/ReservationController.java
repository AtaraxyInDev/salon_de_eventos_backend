package com.tu_paquete.salon_reservations.controller;

import com.tu_paquete.salon_reservations.model.Reservation;
import com.tu_paquete.salon_reservations.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

// src/main/java/com/tu_paquete/salon_reservations/controller/ReservationController.java
@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @PostMapping
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return reservationService.saveReservation(reservation);
    }

    @GetMapping("/salon/{salonId}")
    public List<Reservation> getReservationsBySalon(@PathVariable String salonId) {
        return reservationService.getReservationsBySalon(salonId);
    }

    @PatchMapping("/{id}")
    public Reservation confirmReservation(@PathVariable String id, @RequestBody Map<String, Boolean> update) {
        return reservationService.confirmReservation(id, update.get("confirmed"));
    }

    @DeleteMapping("/{id}")
    public void cancelReservation(@PathVariable String id) {
        reservationService.cancelReservation(id);
    }
}
