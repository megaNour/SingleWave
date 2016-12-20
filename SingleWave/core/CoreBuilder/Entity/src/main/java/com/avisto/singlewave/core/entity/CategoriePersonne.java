package com.avisto.singlewave.core.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 */
@Entity
public class CategoriePersonne extends Categorie {

    /**
     * En vue du SOA.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public CategoriePersonne() {
    }

    /**
     *
     */
    @ManyToOne
    @JoinColumn(name = "parent_fk")
    private CategoriePersonne parent;

    /**
     *
     */
    @OneToMany(mappedBy = "parent")
    private List<CategoriePersonne> enfants;

    /**
     *
     */
    @ManyToOne
    @JoinColumn(name = "possesseur_fk")
    private Utilisateur possesseur;

    /**
     *
     */
    @ManyToOne
    @JoinColumn(name = "possede_fk")
    private Utilisateur personne;

    /**
     * @return the parent
     */
    public CategoriePersonne getParent() {
        return parent;
    }

    /**
     * @param paramParent the parent to set
     */
    public void setParent(CategoriePersonne paramParent) {
        parent = paramParent;
    }

    /**
     * @return the enfants
     */
    public List<CategoriePersonne> getEnfants() {
        return enfants;
    }

    /**
     * @param paramEnfants the enfants to set
     */
    public void setEnfants(List<CategoriePersonne> paramEnfants) {
        enfants = paramEnfants;
    }

    /**
     * @return the possesseur
     */
    public Utilisateur getPossesseur() {
        return possesseur;
    }

    /**
     * @param paramPossesseur the possesseur to set
     */
    public void setPossesseur(Utilisateur paramPossesseur) {
        possesseur = paramPossesseur;
    }

    /**
     * @return the personne
     */
    public Utilisateur getPersonne() {
        return personne;
    }

    /**
     * @param paramPersonne the personne to set
     */
    public void setPersonne(Utilisateur paramPersonne) {
        personne = paramPersonne;
    }
}
