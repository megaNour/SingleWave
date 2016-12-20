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
    @ManyToOne
    @JoinColumn(name = "parent_fk")
    private Localisation parent;

    /**
     *
     */
    @OneToMany(mappedBy = "parent")
    private List<Localisation> enfants;

    /**
     *
     */
    @OneToMany(mappedBy = "localisation_fk")
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
