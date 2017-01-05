package com.avisto.singlewave.core.dto;


import java.io.Serializable;

/**
 *
 */
public class Categorie implements Serializable {

    /**
     * En vue du SOA.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public Categorie() {
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
}
