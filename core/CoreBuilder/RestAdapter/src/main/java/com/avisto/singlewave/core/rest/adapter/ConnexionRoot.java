package com.avisto.singlewave.core.rest.adapter;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.avisto.singlewave.core.data.api.DaoUtilisateurItf;
import com.avisto.singlewave.core.dto.UtilisateurDto;
import com.avisto.singlewave.core.wrap.LoginWrap;

/**
 * La resource qui gere ce qui concerne la connexion :
 * <ul>
 * <li> log in </li>
 * <li> log out </li>
 * <li> creation </li>
 * <li> recuperation </li>
 * <li> maj </li>
 * <li> suppression </li>
 * </ul> .
 * @author alkotob
 *
 */
@Stateless
@Path("/connexion")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ConnexionRoot {

    @EJB
    private DaoUtilisateurItf daoUtilisateur;
    /**
     * Methode d'identification .
     * @param login .
     * @return un {@link UtilisateurDto} ou null si echec .
     */
    @POST
    @Path("/post")
    public String login(LoginWrap login) {
        String resultat = "";
        resultat = "login:" + login.getLogin() + " password:" + login.getPassword();
        return resultat;
    }
    /**
     * Methode d'identification .
     * @param login .
     * @return un {@link UtilisateurDto} ou null si echec .
     */
    @POST
    @Path("/signup")
    public String signUp(LoginWrap login) {
        String resultat = "";
        UtilisateurDto utilisateur = new UtilisateurDto();
        utilisateur.setMail(login.getLogin());
        utilisateur.setPassword(login.getPassword());
        resultat = "login:" + utilisateur.getMail() + " password:" + utilisateur.getPassword();
        utilisateur = daoUtilisateur.signUp(utilisateur);
        if (utilisateur != null) {
            System.out.println("########## sign up ########## : " + resultat);
        } else {
            System.out.println("########## sign up ########## : echec " + resultat);
        }
        return resultat;
    }
    /**
     * Methode d'identification .
     * @param login .
     * @return un {@link UtilisateurDto} ou null si echec .
     */
    @POST
    @Path("/signin")
    public String signin(LoginWrap login) {
        String resultat = "";
        resultat = "login:" + login.getLogin() + " password:" + login.getPassword();
        System.out.println("########## sign in ########## : " + resultat);
        return resultat;
    }

    @GET
    @Path("/{username}")
    public String getUser(@PathParam("username") String userName) {
        String result = "hello " + userName;
        System.out.println("########## " + result + " ##########");
        return result;
    }
}
