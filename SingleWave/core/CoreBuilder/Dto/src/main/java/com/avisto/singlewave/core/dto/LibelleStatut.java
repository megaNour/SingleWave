package com.avisto.singlewave.core.dto;


import java.io.Serializable;
import java.util.List;

/**
 *
 */
public class LibelleStatut implements Serializable {

    /**
     * En vue du SOA.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public LibelleStatut() {
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
    private List<Statut> statuts;

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
     * @return the statuts
     */
    public List<Statut> getStatuts() {
        return statuts;
    }

    /**
     * @param paramStatuts the statuts to set
     */
    public void setStatuts(List<Statut> paramStatuts) {
        statuts = paramStatuts;
    }
}
