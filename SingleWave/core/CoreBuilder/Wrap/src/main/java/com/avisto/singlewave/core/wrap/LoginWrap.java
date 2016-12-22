package com.avisto.singlewave.core.wrap;
/**
 * Un wrap qui contient les identifiants d'une personne tentant de se connecter.
 * @author alkotob
 *
 */
public class LoginWrap {
    /**
     *
     */
    private String identifiant;
    /**
     *
     */
    private String mdp;
    /**
     * Constructeur surchargé .
     * @param paramIdentifiant .
     * @param paramMdp .
     */
    public LoginWrap(String paramIdentifiant, String paramMdp) {
        super();
        identifiant = paramIdentifiant;
        mdp = paramMdp;
    }
    /**
     *
     */
    public LoginWrap() {
        super();
    }
    /**
     * @return the identifiant
     */
    public String getIdentifiant() {
        return identifiant;
    }
    /**
     * @param paramIdentifiant the identifiant to set
     */
    public void setIdentifiant(String paramIdentifiant) {
        identifiant = paramIdentifiant;
    }
    /**
     * @return the mdp
     */
    public String getMdp() {
        return mdp;
    }
    /**
     * @param paramMdp the mdp to set
     */
    public void setMdp(String paramMdp) {
        mdp = paramMdp;
    }
}
