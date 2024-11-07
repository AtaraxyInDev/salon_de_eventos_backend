package com.tu_paquete.salon_reservations.controller;

import com.tu_paquete.salon_reservations.model.Reservation;
import com.tu_paquete.salon_reservations.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @PostMapping public Reservation createReservation(@RequestBody Reservation reservation) { 
        return reservationService.saveReservation(reservation); 
    }
}
// Otros métodos... }
