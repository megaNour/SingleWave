package com.avisto.singlewave.core.dto;


import java.util.List;

/**
 *
 */
public class CategorieEvenement extends Categorie {

    /**
     * En vue du SOA.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public CategorieEvenement() {
    }

    /**
     *
     */
    private CategorieEvenement parent;

    /**
     *
     */
    private List<CategorieEvenement> enfants;

    /**
     *
     */
    private List<Evenement> evenements;

    /**
     * @return the parent
     */
    public CategorieEvenement getParent() {
        return parent;
    }

    /**
     * @param paramParent the parent to set
     */
    public void setParent(CategorieEvenement paramParent) {
        parent = paramParent;
    }

    /**
     * @return the enfants
     */
    public List<CategorieEvenement> getEnfants() {
        return enfants;
    }

    /**
     * @param paramEnfants the enfants to set
     */
    public void setEnfants(List<CategorieEvenement> paramEnfants) {
        enfants = paramEnfants;
    }

    /**
     * @return the evenements
     */
    public List<Evenement> getEvenements() {
        return evenements;
    }

    /**
     * @param paramEvenements the evenements to set
     */
    public void setEvenements(List<Evenement> paramEvenements) {
        evenements = paramEvenements;
    }
}
