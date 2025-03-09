package tn.esprit.tpfoyer.controllers;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.services.IChambreServices;

import java.util.List;

@RestController
@RequestMapping("/chambre")
@AllArgsConstructor
public class ChambreController {
    IChambreServices chambreService;

    @GetMapping("/nonReserve/{nomUniversite}/{type}")
    public List<Chambre> getChambresNonReservees(
            @PathVariable String nomUniversite,
            @PathVariable TypeChambre type) {
        return chambreService.getChambresNonReserveParNomUniversiteEtTypeChambre(nomUniversite, type);
    }

    @GetMapping("/bloc/{idBloc}/{type}")
    public List<Chambre> getChambresParBlocEtType(
            @PathVariable long idBloc,
            @PathVariable TypeChambre type) {
        return chambreService.getChambresParBlocEtType(idBloc, type);
    }

    @GetMapping("/bloc-keywords/{idBloc}/{type}")
    public List<Chambre> getChambresParBlocEtTypeKeywords(
            @PathVariable long idBloc,
            @PathVariable TypeChambre type) {
        return chambreService.getChambresParBlocEtTypeKeywords(idBloc, type);
    }
}

}