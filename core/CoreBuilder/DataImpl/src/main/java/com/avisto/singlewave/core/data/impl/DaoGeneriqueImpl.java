package com.avisto.singlewave.core.data.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.avisto.singlewave.core.data.api.DaoGeneriqueItf;

/**
 * @author alkotob
 * Implementation du dao generique.
 * @param <T> le type manipule.
 */
@Stateless
public class DaoGeneriqueImpl<T> implements DaoGeneriqueItf<T> {
    /**
     * Le type manipule.
     */
    private Class<T> type;
    /**
     * L'entity manager du dao.
     */
    @PersistenceContext(unitName = "SingleWaveDS")
    private EntityManager em;

    @Override
    public T find(Integer paramId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T persist(T paramT) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T merge(T paramT) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean remove(T paramT) {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * @return the type
     */
    public Class<T> getType() {
        return type;
    }

    /**
     * @param paramType the type to set
     */
    public void setType(Class<T> paramType) {
        type = paramType;
    }

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param paramEm the em to set
     */
    public void setEm(EntityManager paramEm) {
        em = paramEm;
    }

}
