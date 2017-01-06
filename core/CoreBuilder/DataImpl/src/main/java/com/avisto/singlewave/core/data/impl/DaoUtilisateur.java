package com.avisto.singlewave.core.data.impl;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;

import com.avisto.singlewave.core.data.api.DaoUtilisateurItf;
import com.avisto.singlewave.core.dto.UtilisateurDto;
import com.avisto.singlewave.core.entity.Utilisateur;

@Stateless
@Local
public class DaoUtilisateur<T> extends DaoGeneriqueImpl<T> implements DaoUtilisateurItf {

    public void init() {
    }

    public UtilisateurDto signUp(UtilisateurDto paramUtilisateur) {
        System.out.println("JE PASSE ######################");
        System.out.println("JE PASSE ######################");
        System.out.println("JE PASSE ######################");
        System.out.println("JE PASSE ######################");
        System.out.println("JE PASSE ######################");
        System.out.println("JE PASSE ######################");
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setMail(paramUtilisateur.getMail());
        utilisateur.setPassword(paramUtilisateur.getPassword());
        utilisateur.setIsActif(true);
        utilisateur.setNom(paramUtilisateur.getMail());
        utilisateur.setPrenom(paramUtilisateur.getMail());
        utilisateur.setSalt(paramUtilisateur.getMail());
        em.persist(utilisateur);
        utilisateurToDto(paramUtilisateur, utilisateur);
        return paramUtilisateur;
    }

    public UtilisateurDto signIn(UtilisateurDto paramUtilisateur) {
        UtilisateurDto dto = null;
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
            utilisateurToDto(dto, entity);
        } catch (NoResultException e) {
            System.out.println("######### utilisateur non trouvé # login: "
                    + paramUtilisateur.getMail()
                    + " password: " + paramUtilisateur.getPassword());
        }
        return dto;
    }

    private void utilisateurToDto(UtilisateurDto dto, Utilisateur entity) {
        dto.setMail(entity.getMail());
        dto.setPassword(entity.getPassword());
        dto.setIsActif(entity.getIsActif());
        dto.setNom(entity.getNom());
        dto.setNom(entity.getPrenom());
        dto.setSalt(entity.getSalt());
    }
}
