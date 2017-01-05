package com.avisto.singlewave.core.web.managedbean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.avisto.singlewave.core.data.api.DaoGeneriqueItf;

@ManagedBean
@SessionScoped
public class TestMB {
    @EJB
    DaoGeneriqueItf<String> dao;
    
    public String testMe(){
        System.out.println(dao.toString());
        return "";
    }
}
