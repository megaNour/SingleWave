package com.avisto.singlewave.core.dto;


import java.util.List;

/**
 *
 */
public class DtoLocalisation extends DtoCategorie {

    /**
     * En vue du SOA.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public DtoLocalisation() {
    }

    /**
     *
     */
    private DtoLocalisation parent;

    /**
     *
     */
    private List<DtoLocalisation> enfants;

    /**
     *
     */
    private List<DtoLieu> lieux;

    /**
     * @return the parent
     */
    public DtoLocalisation getParent() {
        return parent;
    }

    /**
     * @param paramParent the parent to set
     */
    public void setParent(DtoLocalisation paramParent) {
        parent = paramParent;
    }

    /**
     * @return the enfants
     */
    public List<DtoLocalisation> getEnfants() {
        return enfants;
    }

    /**
     * @param paramEnfants the enfants to set
     */
    public void setEnfants(List<DtoLocalisation> paramEnfants) {
        enfants = paramEnfants;
    }

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
}
