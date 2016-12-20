package com.avisto.singlewave.core.entity;

import java.io.Serializable;
import java.util.Date;
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
public class Evenement implements Serializable {

    /**
     * En vue du SOA.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public Evenement() {
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
    private Date dateEvenement;

    /**
     *
     */
    private String libelle;

    /**
     *
     */
    @ManyToOne
    @JoinColumn(name = "categorie_fk")
    private CategorieEvenement categorie;

    /**
     *
     */
    @ManyToOne
    @JoinColumn(name = "createur_fk")
    private Utilisateur createur;

    /**
     *
     */
    @OneToMany(mappedBy = "evenement")
    private List<Organisateur> organisateurs;

    /**
     *
     */
    @OneToMany(mappedBy = "evenement")
    private List<Statut> statuts;

    /**
     *
     */
    @ManyToOne
    @JoinColumn(name = "lieu_fk")
    private Lieu lieu;

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
     * @return the dateEvenement
     */
    public Date getDateEvenement() {
        return dateEvenement;
    }

    /**
     * @param paramDateEvenement the dateEvenement to set
     */
    public void setDateEvenement(Date paramDateEvenement) {
        dateEvenement = paramDateEvenement;
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
     * @return the categorie
     */
    public CategorieEvenement getCategorie() {
        return categorie;
    }

    /**
     * @param paramCategorie the categorie to set
     */
    public void setCategorie(CategorieEvenement paramCategorie) {
        categorie = paramCategorie;
    }

    /**
     * @return the createur
     */
    public Utilisateur getCreateur() {
        return createur;
    }

    /**
     * @param paramCreateur the createur to set
     */
    public void setCreateur(Utilisateur paramCreateur) {
        createur = paramCreateur;
    }

    /**
     * @return the organisateurs
     */
    public List<Organisateur> getOrganisateurs() {
        return organisateurs;
    }

    /**
     * @param paramOrganisateurs the organisateurs to set
     */
    public void setOrganisateurs(List<Organisateur> paramOrganisateurs) {
        organisateurs = paramOrganisateurs;
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

    /**
     * @return the lieu
     */
    public Lieu getLieu() {
        return lieu;
    }

    /**
     * @param paramLieu the lieu to set
     */
    public void setLieu(Lieu paramLieu) {
        lieu = paramLieu;
    }
}
