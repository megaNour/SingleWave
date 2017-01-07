package com.avisto.singlewave.core.data.impl;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import com.avisto.singlewave.core.data.api.DaoUtilisateurItf;
import com.avisto.singlewave.core.dto.DtoUtilisateur;
import com.avisto.singlewave.core.entity.Utilisateur;

@Stateless
@Local
public class DaoUtilisateur implements DaoUtilisateurItf {
    /**
     * L'entity manager du dao.
     */
    @PersistenceContext(unitName = "SingleWaveDS")
    private EntityManager em;

    public DtoUtilisateur signUp(DtoUtilisateur paramUtilisateur) {
        DtoUtilisateur dto = findByLogin(paramUtilisateur.getMail());
        try {
            if (dto == null) {
                System.out.println("######### création de l'utilisateur # login : " + paramUtilisateur.getMail());
                Utilisateur entity = new Utilisateur();
                entity.setMail(paramUtilisateur.getMail());
                entity.setPassword(paramUtilisateur.getPassword());
                entity.setIsActif(true);
                entity.setNom(paramUtilisateur.getMail());
                entity.setPrenom(paramUtilisateur.getMail());
                entity.setSalt(paramUtilisateur.getMail());
                em.persist(entity);
                paramUtilisateur = utilisateurToDto(entity);
            }
            else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("######### utilisateur déjà existant # login : " + paramUtilisateur.getMail());
            paramUtilisateur = null;
        }
        return paramUtilisateur;
    }

    public DtoUtilisateur signIn(DtoUtilisateur paramUtilisateur) {
        DtoUtilisateur dto = null;
        Utilisateur entity;
        String query = "FROM Utilisateur u "
                + "WHERE u.mail = :paramMail "
                + "AND u.password = :paramPassword";
        try {
            entity =
                    (Utilisateur) em.createQuery(query)
                    .setParameter("paramMail", paramUtilisateur.getMail())
                    .setParameter("paramPassword", paramUtilisateur.getPassword())
                    .getSingleResult();
            dto = utilisateurToDto(entity);
            System.out.println("######### utilisateur identifié # login: "
                    + paramUtilisateur.getMail()
                    + " password: " + paramUtilisateur.getPassword());
        } catch (NoResultException e) {
            System.out.println("######### utilisateur non trouvé # login: "
                    + paramUtilisateur.getMail()
                    + " password: " + paramUtilisateur.getPassword());
        }
        return dto;
    }

    public DtoUtilisateur findByLogin(String paramLogin) {
        DtoUtilisateur dto = null;
        Utilisateur entity;
        String query = "FROM Utilisateur u WHERE u.mail = :paramMail";
        try {
            entity = 
                    (Utilisateur) em.createQuery(query)
                    .setParameter("paramMail", paramLogin)
                    .getSingleResult();
            dto = utilisateurToDto(entity);
        } catch (NoResultException e) {
            System.out.println("######### utilisateur non trouvé # login : " + paramLogin);
        }
        return dto;
    }

    private DtoUtilisateur utilisateurToDto(Utilisateur entity) {
        DtoUtilisateur dto = new DtoUtilisateur();
        dto.setId(entity.getId());
        dto.setMail(entity.getMail());
        dto.setPassword(entity.getPassword());
        dto.setIsActif(entity.getIsActif());
        dto.setNom(entity.getNom());
        dto.setPrenom(entity.getPrenom());
        dto.setSalt(entity.getSalt());
        return dto;
    }
}
