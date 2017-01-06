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
    private String login;
    /**
     *
     */
    private String password;
    /**
     * Constructeur surchargé .
     * @param paramLogin .
     * @param paramPassword .
     */
    public LoginWrap(String paramLogin, String paramPassword) {
        super();
        login = paramLogin;
        password = paramPassword;
    }
    /**
     *
     */
    public LoginWrap() {
        super();
    }
    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }
    /**
     * @param paramLogin the login to set
     */
    public void setLogin(String paramLogin) {
        login = paramLogin;
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
}
