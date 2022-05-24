package net.facture.ref.ajoutFacture.repository;


import net.facture.ref.ajoutFacture.model.Client;
import net.facture.ref.ajoutFacture.model.FactureClient;
import net.facture.ref.ajoutFacture.model.FactureService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface FactureServiceRepository extends JpaRepository<FactureService,Long> {

    Page<FactureService> findByClient(Client client , Pageable pageable);

    Page<FactureService> findByDesignationFSContains(@Param("designationFS") String designationFS, Pageable pageable);
}
