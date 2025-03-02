package tn.esprit.tp_foyer.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    private Date dateNaissance;

    @OneToMany(mappedBy = "etudiant", cascade = CascadeType.ALL)
    private List<Reservation> reservations;
}
