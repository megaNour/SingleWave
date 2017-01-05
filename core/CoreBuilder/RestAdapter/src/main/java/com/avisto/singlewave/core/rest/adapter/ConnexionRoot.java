package com.avisto.singlewave.core.rest.adapter;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.avisto.singlewave.core.dto.Utilisateur;
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
@Path("/connexion")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ConnexionRoot {
    /**
     * Methode d'identification .
     * @param login .
     * @return un {@link Utilisateur} ou null si echec .
     */
    @POST
    @Path("/post")
//    @Consumes("application/x-www-form-urlencoded")
    public String login(LoginWrap login) {
        String resultat = "";
        resultat = "login:" + login.getLogin() + " password:" + login.getPassword();
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
