package com.avisto.singlewave.core.dto;


import java.util.List;

/**
 *
 */
public class CategorieLieu extends Categorie {

    /**
     * En vue du SOA.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public CategorieLieu() {
    }

    /**
     *
     */
    private List<Lieu> lieux;

    /**
     *
     */
    private CategorieLieu parent;

    /**
     *
     */
    private List<CategorieLieu> enfants;

    /**
     * @return the lieux
     */
    public List<Lieu> getLieux() {
        return lieux;
    }

    /**
     * @param paramLieux the lieux to set
     */
    public void setLieux(List<Lieu> paramLieux) {
        lieux = paramLieux;
    }

    /**
     * @return the parent
     */
    public CategorieLieu getParent() {
        return parent;
    }

    /**
     * @param paramParent the parent to set
     */
    public void setParent(CategorieLieu paramParent) {
        parent = paramParent;
    }

    /**
     * @return the enfants
     */
    public List<CategorieLieu> getEnfants() {
        return enfants;
    }

    /**
     * @param paramEnfants the enfants to set
     */
    public void setEnfants(List<CategorieLieu> paramEnfants) {
        enfants = paramEnfants;
    }
}
