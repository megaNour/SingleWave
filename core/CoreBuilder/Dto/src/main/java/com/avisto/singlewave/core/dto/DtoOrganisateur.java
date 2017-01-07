package com.avisto.singlewave.core.dto;


import java.io.Serializable;

/**
 *
 */
public class DtoOrganisateur implements Serializable {

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
    public DtoOrganisateur() {
    }

    /**
     *
     */
    private DtoEvenement evenement;

    /**
     *
     */
    private DtoUtilisateur utilisateur;

    /**
     * @return the evenement
     */
    public DtoEvenement getEvenement() {
        return evenement;
    }

    /**
     * @param paramEvenement the evenement to set
     */
    public void setEvenement(DtoEvenement paramEvenement) {
        evenement = paramEvenement;
    }

    /**
     * @return the utilisateur
     */
    public DtoUtilisateur getUtilisateur() {
        return utilisateur;
    }

    /**
     * @param paramUtilisateur the utilisateur to set
     */
    public void setUtilisateur(DtoUtilisateur paramUtilisateur) {
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
