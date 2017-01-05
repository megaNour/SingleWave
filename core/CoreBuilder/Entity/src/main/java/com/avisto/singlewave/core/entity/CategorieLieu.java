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
    @OneToMany(mappedBy = "categorie")
    private List<Lieu> lieux;

    /**
     *
     */
    @ManyToOne
    @JoinColumn(name = "parent_fk")
    private CategorieLieu parent;

    /**
     *
     */
    @OneToMany(mappedBy = "parent")
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
