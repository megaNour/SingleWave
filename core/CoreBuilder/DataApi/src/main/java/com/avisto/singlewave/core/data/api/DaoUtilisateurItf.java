package com.avisto.singlewave.core.data.api;

import com.avisto.singlewave.core.dto.DtoUtilisateur;
public interface DaoUtilisateurItf {
    public DtoUtilisateur signUp(DtoUtilisateur paramUtilisateur);
    public DtoUtilisateur signIn(DtoUtilisateur paramUtilisateur);
    public DtoUtilisateur findByLogin(String paramLogin);
}
