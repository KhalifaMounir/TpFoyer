package tn.esprit.tp_foyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.entity.Universite;
import tn.esprit.tp_foyer.repository.UniversiteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UniversiteService {

    @Autowired
    private UniversiteRepository universiteRepository;

    public List<Universite> retrieveAllUniversities() {
        return universiteRepository.findAll();
    }

    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    public Universite updateUniversite(Universite u) {
        if (universiteRepository.existsById(u.getIdUniversite())) {
            return universiteRepository.save(u);
        }
        return null;
    }

    public Universite retrieveUniversite(long idUniversite) {
        Optional<Universite> universite = universiteRepository.findById(idUniversite);
        return universite.orElse(null);
    }
}
