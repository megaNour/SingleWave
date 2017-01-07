package com.avisto.singlewave.core.dto;


import java.io.Serializable;
import java.util.List;

/**
 *
 */
public class DtoUtilisateur implements Serializable {

    /**
     * En vue du SOA.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public DtoUtilisateur() {
    }

    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String nom;

    /**
     *
     */
    private String prenom;

    /**
     *
     */
    private String mail;

    /**
     *
     */
    private String password;

    /**
     *
     */
    private String salt;

    /**
     *
     */
    private Boolean isActif;

    /**
     *
     */
    private List<DtoEvenement> evenementsCrees;

    /**
     *
     */
    private List<DtoStatut> statut;

    /**
     *
     */
    private List<DtoCategoriePersonne> categoriesPersonnesParents;


    /**
     *
     */
    private List<DtoCategoriePersonne> categoriesPersonnesEnfants;


    /**
     *
     */
    private List<DtoOrganisateur> organisateur;


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
     * @return the nom
     */
    public String getNom() {
        return nom;
    }


    /**
     * @param paramNom the nom to set
     */
    public void setNom(String paramNom) {
        nom = paramNom;
    }


    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }


    /**
     * @param paramPrenom the prenom to set
     */
    public void setPrenom(String paramPrenom) {
        prenom = paramPrenom;
    }


    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }


    /**
     * @param paramMail the mail to set
     */
    public void setMail(String paramMail) {
        mail = paramMail;
    }


    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }


    /**
     * @param paramPassword the password to set
     */
    public void setPassword(String paramPassword) {
        password = paramPassword;
    }


    /**
     * @return the salt
     */
    public String getSalt() {
        return salt;
    }


    /**
     * @param paramSalt the salt to set
     */
    public void setSalt(String paramSalt) {
        salt = paramSalt;
    }


    /**
     * @return the isActif
     */
    public Boolean getIsActif() {
        return isActif;
    }


    /**
     * @param paramIsActif the isActif to set
     */
    public void setIsActif(Boolean paramIsActif) {
        isActif = paramIsActif;
    }


    /**
     * @return the evenementsCrees
     */
    public List<DtoEvenement> getEvenementsCrees() {
        return evenementsCrees;
    }


    /**
     * @param paramEvenementsCrees the evenementsCrees to set
     */
    public void setEvenementsCrees(List<DtoEvenement> paramEvenementsCrees) {
        evenementsCrees = paramEvenementsCrees;
    }


    /**
     * @return the statut
     */
    public List<DtoStatut> getStatut() {
        return statut;
    }


    /**
     * @param paramStatut the statut to set
     */
    public void setStatut(List<DtoStatut> paramStatut) {
        statut = paramStatut;
    }


    /**
     * @return the categoriesPersonnesParents
     */
    public List<DtoCategoriePersonne> getCategoriesPersonnesParents() {
        return categoriesPersonnesParents;
    }


    /**
     * @param paramCategoriesPersonnesParents the categoriesPersonnesParents to set
     */
    public void setCategoriesPersonnesParents(
            List<DtoCategoriePersonne> paramCategoriesPersonnesParents) {
        categoriesPersonnesParents = paramCategoriesPersonnesParents;
    }


    /**
     * @return the categoriesPersonnesEnfants
     */
    public List<DtoCategoriePersonne> getCategoriesPersonnesEnfants() {
        return categoriesPersonnesEnfants;
    }


    /**
     * @param paramCategoriesPersonnesEnfants the categoriesPersonnesEnfants to set
     */
    public void setCategoriesPersonnesEnfants(
            List<DtoCategoriePersonne> paramCategoriesPersonnesEnfants) {
        categoriesPersonnesEnfants = paramCategoriesPersonnesEnfants;
    }


    /**
     * @return the organisateur
     */
    public List<DtoOrganisateur> getOrganisateur() {
        return organisateur;
    }


    /**
     * @param paramOrganisateur the organisateur to set
     */
    public void setOrganisateur(List<DtoOrganisateur> paramOrganisateur) {
        organisateur = paramOrganisateur;
    }
}