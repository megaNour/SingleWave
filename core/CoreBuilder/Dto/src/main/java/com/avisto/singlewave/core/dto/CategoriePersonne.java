package com.avisto.singlewave.core.dto;


import java.util.List;

/**
 *
 */
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
    private CategoriePersonne parent;

    /**
     *
     */
    private List<CategoriePersonne> enfants;

    /**
     *
     */
    private UtilisateurDto possesseur;

    /**
     *
     */
    private UtilisateurDto personne;

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
    public UtilisateurDto getPossesseur() {
        return possesseur;
    }

    /**
     * @param paramPossesseur the possesseur to set
     */
    public void setPossesseur(UtilisateurDto paramPossesseur) {
        possesseur = paramPossesseur;
    }

    /**
     * @return the personne
     */
    public UtilisateurDto getPersonne() {
        return personne;
    }

    /**
     * @param paramPersonne the personne to set
     */
    public void setPersonne(UtilisateurDto paramPersonne) {
        personne = paramPersonne;
    }
}
