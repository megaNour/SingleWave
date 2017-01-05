package com.avisto.singlewave.core.dto;


import java.util.List;

/**
 *
 */
public class Localisation extends Categorie {

    /**
     * En vue du SOA.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public Localisation() {
    }

    /**
     *
     */
    private Localisation parent;

    /**
     *
     */
    private List<Localisation> enfants;

    /**
     *
     */
    private List<Lieu> lieux;

    /**
     * @return the parent
     */
    public Localisation getParent() {
        return parent;
    }

    /**
     * @param paramParent the parent to set
     */
    public void setParent(Localisation paramParent) {
        parent = paramParent;
    }

    /**
     * @return the enfants
     */
    public List<Localisation> getEnfants() {
        return enfants;
    }

    /**
     * @param paramEnfants the enfants to set
     */
    public void setEnfants(List<Localisation> paramEnfants) {
        enfants = paramEnfants;
    }

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
}
