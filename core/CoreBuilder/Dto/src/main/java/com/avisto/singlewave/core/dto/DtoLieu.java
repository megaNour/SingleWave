package com.avisto.singlewave.core.dto;


import java.io.Serializable;
import java.util.List;

/**
 *
 */
public class DtoLieu  implements Serializable {

    /**
     * En vue du SOA.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public DtoLieu() {
    }

    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String libelle;

    /**
     *
     */
    private DtoLocalisation localisation;

    /**
     *
     */
    private DtoCategorieLieu categorie;

    /**
     *
     */
    private List<DtoEvenement> evenements;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param paramId the id to set
     */
    public void setId(Integer paramId) {
        id = paramId;
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param paramLibelle the libelle to set
     */
    public void setLibelle(String paramLibelle) {
        libelle = paramLibelle;
    }

    /**
     * @return the localisation
     */
    public DtoLocalisation getLocalisation() {
        return localisation;
    }

    /**
     * @param paramLocalisation the localisation to set
     */
    public void setLocalisation(DtoLocalisation paramLocalisation) {
        localisation = paramLocalisation;
    }

    /**
     * @return the categorie
     */
    public DtoCategorieLieu getCategorie() {
        return categorie;
    }

    /**
     * @param paramCategorie the categorie to set
     */
    public void setCategorie(DtoCategorieLieu paramCategorie) {
        categorie = paramCategorie;
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
