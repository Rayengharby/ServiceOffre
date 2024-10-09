package com.sip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sip.Entity.Offre;
import com.sip.Repository.OffreRepository;

@SpringBootApplication
public class ExamnTpApplication implements CommandLineRunner {

    @Autowired
    private OffreRepository offreRepository; // Injection du repository

    public static void main(String[] args) {
        SpringApplication.run(ExamnTpApplication.class, args);
        System.out.println("TP SOA");
    }

    @Override
    public void run(String... args) throws Exception {
        // Sauvegarde des offres dans la base de données
        offreRepository.save(new Offre("Web Design", "informatique", "AXA", 2, "France"));
        offreRepository.save(new Offre("Developpeur", "informatique", "Talys", 3, "Tunisie"));
        offreRepository.save(new Offre("Architecte", "informatique", "SIS", 2, "Allemagne"));
    }
}
