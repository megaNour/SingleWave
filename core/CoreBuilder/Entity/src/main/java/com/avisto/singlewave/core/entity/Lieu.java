package com.avisto.singlewave.core.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 */
@Entity
public class Lieu  implements Serializable {

    /**
     * En vue du SOA.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public Lieu() {
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
    @ManyToOne
    @JoinColumn(name = "localisation_fk", insertable=false, updatable=false)
    private Localisation localisation;

    /**
     *
     */
    @ManyToOne
    @JoinColumn(name = "localisation_fk")
    private CategorieLieu categorie;

    /**
     *
     */
    @OneToMany(mappedBy = "lieu")
    private List<Evenement> evenements;

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
    public Localisation getLocalisation() {
        return localisation;
    }

    /**
     * @param paramLocalisation the localisation to set
     */
    public void setLocalisation(Localisation paramLocalisation) {
        localisation = paramLocalisation;
    }

    /**
     * @return the categorie
     */
    public CategorieLieu getCategorie() {
        return categorie;
    }

    /**
     * @param paramCategorie the categorie to set
     */
    public void setCategorie(CategorieLieu paramCategorie) {
        categorie = paramCategorie;
    }

    /**
     * @return the evenements
     */
    public List<Evenement> getEvenements() {
        return evenements;
    }

    /**
     * @param paramEvenements the evenements to set
     */
    public void setEvenements(List<Evenement> paramEvenements) {
        evenements = paramEvenements;
    }
}
