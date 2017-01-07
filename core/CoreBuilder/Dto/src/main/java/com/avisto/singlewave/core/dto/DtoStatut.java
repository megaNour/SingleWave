package com.avisto.singlewave.core.dto;


import java.io.Serializable;

/**
 *
 */
public class DtoStatut implements Serializable {

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
    public DtoStatut() {
    }

    /**
     *
     */
    private DtoEvenement evenement;

    /**
     *
     */
    private DtoUtilisateur invite;

    /**
     *
     */
    private DtoLibelleStatut libelleStatut;

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
     * @return the invite
     */
    public DtoUtilisateur getInvite() {
        return invite;
    }

    /**
     * @param paramInvite the invite to set
     */
    public void setInvite(DtoUtilisateur paramInvite) {
        invite = paramInvite;
    }

    /**
     * @return the libelleStatut
     */
    public DtoLibelleStatut getLibelleStatut() {
        return libelleStatut;
    }

    /**
     * @param paramLibelleStatut the libelleStatut to set
     */
    public void setLibelleStatut(DtoLibelleStatut paramLibelleStatut) {
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
