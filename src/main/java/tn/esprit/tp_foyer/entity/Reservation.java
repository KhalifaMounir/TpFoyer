package tn.esprit.tp_foyer.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    private String idReservation;

    private Date anneeUniversitaire;
    private boolean estValide;

    @ManyToOne
    private Etudiant etudiant;

    @ManyToOne
    private Chambre chambre;
}
