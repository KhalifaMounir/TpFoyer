package tn.esprit.tp_foyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.entity.Etudiant;
import tn.esprit.tp_foyer.repository.EtudiantRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        return etudiantRepository.saveAll(etudiants);
    }

    public Etudiant updateEtudiant(Etudiant e) {
        if (etudiantRepository.existsById(e.getIdEtudiant())) {
            return etudiantRepository.save(e);
        }
        return null;
    }

    public Etudiant retrieveEtudiant(long idEtudiant) {
        Optional<Etudiant> etudiant = etudiantRepository.findById(idEtudiant);
        return etudiant.orElse(null);
    }

    public void removeEtudiant(long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }
}
