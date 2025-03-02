package tn.esprit.tp_foyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp_foyer.entity.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
}
