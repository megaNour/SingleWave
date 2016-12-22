package com.avisto.singlewave.core.rest.adapter;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

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
@Path("connexion")
public class ConnexionRoot {
    /**
     * Methode d'identification .
     * @param login .
     * @return un {@link Utilisateur} ou null si echec .
     */
    @POST
    public Utilisateur login(LoginWrap login) {
        return null;
    }
}
