package com.tu_paquete.salon_reservations.service;

import com.tu_paquete.salon_reservations.model.Reservation;
import com.tu_paquete.salon_reservations.model.Salon;
import com.tu_paquete.salon_reservations.repository.ReservationRepository;
import com.tu_paquete.salon_reservations.repository.SalonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// src/main/java/com/tu_paquete/salon_reservations/service/ReservationService.java
@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private SalonRepository salonRepository;

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation saveReservation(Reservation reservation) {
        if (reservation.getSalon() != null && reservation.getSalon().getId() != null) {
            Optional<Salon> salon = salonRepository.findById(reservation.getSalon().getId());
            if (salon.isPresent()) {
                reservation.setSalon(salon.get());
            } else {
                throw new IllegalArgumentException("Salón no encontrado");
            }
        } else {
            throw new IllegalArgumentException("Salón no especificado o ID de salón es nulo");
        }
        return reservationRepository.save(reservation);
    }

    public List<Reservation> getReservationsBySalon(String salonId) {
        return reservationRepository.findBySalonId(salonId);
    }

    public void cancelReservation(String reservationId) {
        reservationRepository.deleteById(reservationId);
    }

    public Reservation confirmReservation(String reservationId, boolean confirmed) {
        Optional<Reservation> reservationOpt = reservationRepository.findById(reservationId);
        if (reservationOpt.isPresent()) {
            Reservation reservation = reservationOpt.get();
            reservation.setConfirmed(confirmed);
            return reservationRepository.save(reservation);
        } else {
            throw new IllegalArgumentException("Reserva no encontrada");
        }
    }
}

