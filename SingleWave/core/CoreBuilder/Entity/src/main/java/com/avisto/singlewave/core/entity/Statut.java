package com.avisto.singlewave.core.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 */
@Entity
public class Statut implements Serializable {

    /**
     * En vue du SOA.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Un id classique plutot qu'un composite pour un code simple.
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer paramId) {
        id = paramId;
    }

    /**
     * Default constructor.
     */
    public Statut() {
    }

    /**
     *
     */
    @ManyToOne
    @JoinColumn(name = "evenement_fk")
    private Evenement evenement;

    /**
     *
     */
    @ManyToOne
    @JoinColumn(name = "invite_fk")
    private Utilisateur invite;

    /**
     *
     */
    @ManyToOne
    @JoinColumn(name = "libelleStatut_fk")
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
}
