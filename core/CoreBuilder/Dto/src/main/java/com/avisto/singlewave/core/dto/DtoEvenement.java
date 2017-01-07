package com.avisto.singlewave.core.dto;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 */
public class DtoEvenement implements Serializable {

    /**
     * En vue du SOA.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public DtoEvenement() {
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
    private DtoCategorieEvenement categorie;

    /**
     *
     */
    private DtoUtilisateur createur;

    /**
     *
     */
    private List<DtoOrganisateur> organisateurs;

    /**
     *
     */
    private List<DtoStatut> statuts;

    /**
     *
     */
    private DtoLieu lieu;

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
    public DtoCategorieEvenement getCategorie() {
        return categorie;
    }

    /**
     * @param paramCategorie the categorie to set
     */
    public void setCategorie(DtoCategorieEvenement paramCategorie) {
        categorie = paramCategorie;
    }

    /**
     * @return the createur
     */
    public DtoUtilisateur getCreateur() {
        return createur;
    }

    /**
     * @param paramCreateur the createur to set
     */
    public void setCreateur(DtoUtilisateur paramCreateur) {
        createur = paramCreateur;
    }

    /**
     * @return the organisateurs
     */
    public List<DtoOrganisateur> getOrganisateurs() {
        return organisateurs;
    }

    /**
     * @param paramOrganisateurs the organisateurs to set
     */
    public void setOrganisateurs(List<DtoOrganisateur> paramOrganisateurs) {
        organisateurs = paramOrganisateurs;
    }

    /**
     * @return the statuts
     */
    public List<DtoStatut> getStatuts() {
        return statuts;
    }

    /**
     * @param paramStatuts the statuts to set
     */
    public void setStatuts(List<DtoStatut> paramStatuts) {
        statuts = paramStatuts;
    }

    /**
     * @return the lieu
     */
    public DtoLieu getLieu() {
        return lieu;
    }

    /**
     * @param paramLieu the lieu to set
     */
    public void setLieu(DtoLieu paramLieu) {
        lieu = paramLieu;
    }
}
