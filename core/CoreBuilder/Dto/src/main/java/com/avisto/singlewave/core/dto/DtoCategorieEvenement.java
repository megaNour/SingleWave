package com.avisto.singlewave.core.dto;


import java.util.List;

/**
 *
 */
public class DtoCategorieEvenement extends DtoCategorie {

    /**
     * En vue du SOA.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public DtoCategorieEvenement() {
    }

    /**
     *
     */
    private DtoCategorieEvenement parent;

    /**
     *
     */
    private List<DtoCategorieEvenement> enfants;

    /**
     *
     */
    private List<DtoEvenement> evenements;

    /**
     * @return the parent
     */
    public DtoCategorieEvenement getParent() {
        return parent;
    }

    /**
     * @param paramParent the parent to set
     */
    public void setParent(DtoCategorieEvenement paramParent) {
        parent = paramParent;
    }

    /**
     * @return the enfants
     */
    public List<DtoCategorieEvenement> getEnfants() {
        return enfants;
    }

    /**
     * @param paramEnfants the enfants to set
     */
    public void setEnfants(List<DtoCategorieEvenement> paramEnfants) {
        enfants = paramEnfants;
    }

    /**
     * @return the evenements
     */
    public List<DtoEvenement> getEvenements() {
        return evenements;
    }

    /**
     * @param paramEvenements the evenements to set
     */
    public void setEvenements(List<DtoEvenement> paramEvenements) {
        evenements = paramEvenements;
    }
}
