package net.facture.ref.gestionFS.service;

import net.facture.ref.ajoutFacture.model.FactureClient;
import net.facture.ref.ajoutFacture.model.FactureService;
import net.facture.ref.ajoutFacture.repository.FactureServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FsServiceImpl implements FsService{

    @Autowired
    private FactureServiceRepository repo;


    @Override
    public List<FactureService> getAllFS() {
        return repo.findAll();
    }

    @Override
    public void saveFactureFS(FactureService factureService) {
        repo.save(factureService);
    }

    @Override
    public FactureService getFactureFSById(Long id) {
        Optional<FactureService> opt = repo.findById(id);
        FactureService factureService = null;
        if (opt.isPresent()) {
            factureService = opt.get();
        } else {
            throw new RuntimeException("Facture Client not found for id :: " + id);
        }
        return factureService;
    }

    @Override
    public void deleteFactureFSById(long id) {
        repo.deleteById(id);
    }
}
