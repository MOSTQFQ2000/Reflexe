package net.facture.ref.gestionFS.service;

import net.facture.ref.ajoutFacture.model.FactureClient;
import net.facture.ref.ajoutFacture.model.FactureService;

import java.util.List;

public interface FsService {
    List<FactureService> getAllFS();


    void saveFactureFS(FactureService factureService);
    FactureService getFactureFSById(Long id);

    void deleteFactureFSById(long id);

}
