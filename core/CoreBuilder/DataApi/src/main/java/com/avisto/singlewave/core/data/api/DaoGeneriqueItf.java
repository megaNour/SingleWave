package com.avisto.singlewave.core.data.api;

/**
 * @author alkotob
 * L'interface qui definit le dao generique.
 * @param <T> le type manipulé. Sera donné dans le constructeur des dao
 */
public interface DaoGeneriqueItf<T> {
    /**
     * find generique.
     * @param id l'id de l'objet recherche
     * @return l'objet recherche.
     */
    T find(Integer id);
    /**
     * persist generique.
     * @param t l'objet a persister
     * @return l'objet persiste
     */
    T persist(T t);
    /**
     * merge generique.
     * @param t l'objet a mettre a jour
     * @return l'objet a jour
     */
    T merge(T t);
    /**
     * remove generique.
     * @param t l'objet a supprimer
     * @return true si l'objet a bien ete supprime, sinon false.
     */
    boolean remove(T t);
}
