package net.facture.ref.ajoutFacture.repository;

import net.facture.ref.ajoutFacture.model.FactureClient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface FactureClientRepository extends JpaRepository <FactureClient,Long>{

    Page<FactureClient> findByDesignationContains(@Param("designation") String designation, Pageable pageable);

}
