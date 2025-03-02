package tn.esprit.tp_foyer.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;

    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    @ManyToOne
    private Bloc bloc;

    @OneToMany(mappedBy = "chambre", cascade = CascadeType.ALL)
    private List<Reservation> reservations;
}
