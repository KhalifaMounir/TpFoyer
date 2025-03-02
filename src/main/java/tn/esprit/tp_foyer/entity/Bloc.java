package tn.esprit.tp_foyer.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;

    private String nomBloc;
    private Long capaciteBloc;

    @ManyToOne
    private Foyer foyer;

    @OneToMany(mappedBy = "bloc", cascade = CascadeType.ALL)
    private List<Chambre> chambres;
}
