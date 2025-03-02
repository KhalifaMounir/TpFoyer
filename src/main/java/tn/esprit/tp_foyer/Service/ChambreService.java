package tn.esprit.tp_foyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.entity.Chambre;
import tn.esprit.tp_foyer.repository.ChambreRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ChambreService {

    @Autowired
    private ChambreRepository chambreRepository;

    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    public Chambre updateChambre(Chambre c) {
        if (chambreRepository.existsById(c.getIdChambre())) {
            return chambreRepository.save(c);
        }
        return null;
    }

    public Chambre retrieveChambre(long idChambre) {
        Optional<Chambre> chambre = chambreRepository.findById(idChambre);
        return chambre.orElse(null);
    }
}
