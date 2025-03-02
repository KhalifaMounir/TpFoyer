package tn.esprit.tp_foyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.entity.Foyer;
import tn.esprit.tp_foyer.repository.FoyerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FoyerService {

    @Autowired
    private FoyerRepository foyerRepository;

    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    public Foyer updateFoyer(Foyer f) {
        if (foyerRepository.existsById(f.getIdFoyer())) {
            return foyerRepository.save(f);
        }
        return null;
    }

    public Foyer retrieveFoyer(long idFoyer) {
        Optional<Foyer> foyer = foyerRepository.findById(idFoyer);
        return foyer.orElse(null);
    }

    public void removeFoyer(long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }
}
