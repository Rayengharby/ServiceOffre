package com.sip.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.sip.Entity.Offre;

public interface OffreRepository extends JpaRepository<Offre, Long> {
    
}
