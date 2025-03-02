package tn.esprit.tp_foyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.entity.Reservation;
import tn.esprit.tp_foyer.repository.ReservationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> retrieveAllReservation() {
        return reservationRepository.findAll();
    }

    public Reservation updateReservation(Reservation res) {
        if (reservationRepository.existsById(res.getIdReservation())) {
            return reservationRepository.save(res);
        }
        return null;
    }

    public Reservation retrieveReservation(String idReservation) {
        Optional<Reservation> reservation = reservationRepository.findById(idReservation);
        return reservation.orElse(null);
    }
}
