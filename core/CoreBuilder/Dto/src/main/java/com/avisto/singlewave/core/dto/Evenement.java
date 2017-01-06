package com.avisto.singlewave.core.dto;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 */
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
    private CategorieEvenement categorie;

    /**
     *
     */
    private UtilisateurDto createur;

    /**
     *
     */
    private List<Organisateur> organisateurs;

    /**
     *
     */
    private List<Statut> statuts;

    /**
     *
     */
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
    public UtilisateurDto getCreateur() {
        return createur;
    }

    /**
     * @param paramCreateur the createur to set
     */
    public void setCreateur(UtilisateurDto paramCreateur) {
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
