package net.facture.ref.ajoutFacture.repository;

import net.facture.ref.ajoutFacture.model.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface ClientRepository extends JpaRepository<Client,Long> {

    Page<Client> findByIceContains(@Param("ice") String ice, Pageable pageable);
}
