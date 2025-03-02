package tn.esprit.tp_foyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.entity.Bloc;
import tn.esprit.tp_foyer.repository.BlocRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BlocService {

    @Autowired
    private BlocRepository blocRepository;

    public List<Bloc> retrieveBlocs() {
        return blocRepository.findAll();
    }

    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    public Bloc updateBloc(Bloc bloc) {
        if (blocRepository.existsById(bloc.getIdBloc())) {
            return blocRepository.save(bloc);
        }
        return null;
    }

    public Bloc retrieveBloc(long idBloc) {
        Optional<Bloc> bloc = blocRepository.findById(idBloc);
        return bloc.orElse(null);
    }

    public void removeBloc(long idBloc) {
        blocRepository.deleteById(idBloc);
    }
}
