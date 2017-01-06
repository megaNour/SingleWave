package com.avisto.singlewave.core.data.api;

import javax.ejb.Local;

import com.avisto.singlewave.core.dto.UtilisateurDto;
@Local
public interface DaoUtilisateurItf {
    public void init();
    public UtilisateurDto signUp(UtilisateurDto paramUtilisateur);
    public UtilisateurDto signIn(UtilisateurDto paramUtilisateur);
}
