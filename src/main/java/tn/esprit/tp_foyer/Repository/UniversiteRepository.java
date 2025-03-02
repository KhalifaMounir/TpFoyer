package tn.esprit.tp_foyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp_foyer.entity.Universite;

public interface UniversiteRepository extends JpaRepository<Universite, Long> {
}
