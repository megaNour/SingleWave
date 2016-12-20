package com.avisto.singlewave.core.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 */
@Entity
public class Organisateur implements Serializable {

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
    @ManyToOne
    @JoinColumn(name = "evenement_fk")
    private Evenement evenement;

    /**
     *
     */
    @ManyToOne
    @JoinColumn(name = "utilisateur_fk")
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
}
