package tn.esprit.tpfoyer.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp_foyer.entity.Reservation;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {

    @Query("SELECT r FROM Reservation r WHERE r.anneeUniversitaire = :anneeUniversitaire AND r.chambre.foyer.nom = :nomUniversite")
    List<Reservation> findByAnneeUniversitaireAndNomUniversite(Date anneeUniversitaire, String nomUniversite);
}