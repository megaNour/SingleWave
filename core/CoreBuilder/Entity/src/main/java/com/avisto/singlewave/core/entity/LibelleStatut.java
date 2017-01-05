package com.avisto.singlewave.core.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 */
@Entity
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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     *
     */
    private String libelle;

    /**
     *
     */
    @OneToMany(mappedBy = "libelleStatut")
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
