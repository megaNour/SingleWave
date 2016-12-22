package com.avisto.singlewave.core.dto;


import java.io.Serializable;

/**
 *
 */
public class Statut implements Serializable {

    /**
     * En vue du SOA.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Un id classique plutot qu'un composite pour un code simple.
     */
    private Integer id;

    /**
     * Default constructor.
     */
    public Statut() {
    }

    /**
     *
     */
    private Evenement evenement;

    /**
     *
     */
    private Utilisateur invite;

    /**
     *
     */
    private LibelleStatut libelleStatut;

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
     * @return the invite
     */
    public Utilisateur getInvite() {
        return invite;
    }

    /**
     * @param paramInvite the invite to set
     */
    public void setInvite(Utilisateur paramInvite) {
        invite = paramInvite;
    }

    /**
     * @return the libelleStatut
     */
    public LibelleStatut getLibelleStatut() {
        return libelleStatut;
    }

    /**
     * @param paramLibelleStatut the libelleStatut to set
     */
    public void setLibelleStatut(LibelleStatut paramLibelleStatut) {
        libelleStatut = paramLibelleStatut;
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
