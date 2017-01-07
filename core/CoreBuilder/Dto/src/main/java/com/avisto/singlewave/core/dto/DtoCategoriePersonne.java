package com.avisto.singlewave.core.dto;


import java.util.List;

/**
 *
 */
public class DtoCategoriePersonne extends DtoCategorie {

    /**
     * En vue du SOA.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public DtoCategoriePersonne() {
    }

    /**
     *
     */
    private DtoCategoriePersonne parent;

    /**
     *
     */
    private List<DtoCategoriePersonne> enfants;

    /**
     *
     */
    private DtoUtilisateur possesseur;

    /**
     *
     */
    private DtoUtilisateur personne;

    /**
     * @return the parent
     */
    public DtoCategoriePersonne getParent() {
        return parent;
    }

    /**
     * @param paramParent the parent to set
     */
    public void setParent(DtoCategoriePersonne paramParent) {
        parent = paramParent;
    }

    /**
     * @return the enfants
     */
    public List<DtoCategoriePersonne> getEnfants() {
        return enfants;
    }

    /**
     * @param paramEnfants the enfants to set
     */
    public void setEnfants(List<DtoCategoriePersonne> paramEnfants) {
        enfants = paramEnfants;
    }

    /**
     * @return the possesseur
     */
    public DtoUtilisateur getPossesseur() {
        return possesseur;
    }

    /**
     * @param paramPossesseur the possesseur to set
     */
    public void setPossesseur(DtoUtilisateur paramPossesseur) {
        possesseur = paramPossesseur;
    }

    /**
     * @return the personne
     */
    public DtoUtilisateur getPersonne() {
        return personne;
    }

    /**
     * @param paramPersonne the personne to set
     */
    public void setPersonne(DtoUtilisateur paramPersonne) {
        personne = paramPersonne;
    }
}
