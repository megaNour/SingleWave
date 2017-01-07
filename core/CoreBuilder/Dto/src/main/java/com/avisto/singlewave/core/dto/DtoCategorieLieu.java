package com.avisto.singlewave.core.dto;


import java.util.List;

/**
 *
 */
public class DtoCategorieLieu extends DtoCategorie {

    /**
     * En vue du SOA.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public DtoCategorieLieu() {
    }

    /**
     *
     */
    private List<DtoLieu> lieux;

    /**
     *
     */
    private DtoCategorieLieu parent;

    /**
     *
     */
    private List<DtoCategorieLieu> enfants;

    /**
     * @return the lieux
     */
    public List<DtoLieu> getLieux() {
        return lieux;
    }

    /**
     * @param paramLieux the lieux to set
     */
    public void setLieux(List<DtoLieu> paramLieux) {
        lieux = paramLieux;
    }

    /**
     * @return the parent
     */
    public DtoCategorieLieu getParent() {
        return parent;
    }

    /**
     * @param paramParent the parent to set
     */
    public void setParent(DtoCategorieLieu paramParent) {
        parent = paramParent;
    }

    /**
     * @return the enfants
     */
    public List<DtoCategorieLieu> getEnfants() {
        return enfants;
    }

    /**
     * @param paramEnfants the enfants to set
     */
    public void setEnfants(List<DtoCategorieLieu> paramEnfants) {
        enfants = paramEnfants;
    }
}
