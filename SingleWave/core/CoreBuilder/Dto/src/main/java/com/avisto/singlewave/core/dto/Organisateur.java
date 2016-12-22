package com.avisto.singlewave.core.dto;


import java.io.Serializable;

/**
 *
 */
public class Organisateur implements Serializable {

    /**
     * Un id classique plutot qu'un composite pour un code simple.
     */
    private Integer id;

    /**
     * En vue du SOA.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public Organisateur() {
    }

    /**
     *
     */
    private Evenement evenement;

    /**
     *
     */
    private Utilisateur utilisateur;

    /**
     * @return the evenement
     */
    public Evenement getEvenement() {
        return evenement;
    }

    /**
     * @param paramEvenement the evenement to set
     */
    public void setEvenement(Evenement paramEvenement) {
        evenement = paramEvenement;
    }

    /**
     * @return the utilisateur
     */
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    /**
     * @param paramUtilisateur the utilisateur to set
     */
    public void setUtilisateur(Utilisateur paramUtilisateur) {
        utilisateur = paramUtilisateur;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param paramId the id to set
     */
    public void setId(Integer paramId) {
        id = paramId;
    }

}
