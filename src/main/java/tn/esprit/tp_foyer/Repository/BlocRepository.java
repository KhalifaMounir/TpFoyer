package tn.esprit.tp_foyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp_foyer.entity.Bloc;

public interface BlocRepository extends JpaRepository<Bloc, Long> {
}
