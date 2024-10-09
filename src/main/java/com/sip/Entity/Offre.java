package com.sip.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Offre { 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code; 
    
    private String intitule; 
    private String specialite; 
    private String societe; 
    private int nbpostes; 
    private String pays;

    // Constructeur par défaut
    public Offre() {}

    // Getters et setters
    public Long getCode() {
        return code;
    }
    
    public void setCode(Long code) {
        this.code = code;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public int getNbpostes() {
        return nbpostes;
    }

    public void setNbpostes(int nbpostes) {
        this.nbpostes = nbpostes;
    }

    public String getPays() {
        return pays;
    }

 // Constructeur avec tous les paramètres sauf code
    public Offre(String intitule, String specialite, String societe, int nbpostes, String pays) {
        this.intitule = intitule;
        this.specialite = specialite;
        this.societe = societe;
        this.nbpostes = nbpostes;
        this.pays = pays;
    }


	public void setPays(String pays) {
        this.pays = pays;
    }

	
	
}
