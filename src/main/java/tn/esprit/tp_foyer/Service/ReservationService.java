package tn.esprit.tp_foyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.entity.Reservation;
import tn.esprit.tp_foyer.Repository.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationServices{

    IReservationRepository reservationRepository;

    @Override
    public List<Reservation> retrieveAllReservation() {
        return (List<Reservation>) reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        if (reservationRepository.existsById(Long.valueOf(res.getIdReservation()))) {
            return reservationRepository.save(res);
        }
        return null;
    }

    @Override
    public Reservation retrieveReservation(Long idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }
}