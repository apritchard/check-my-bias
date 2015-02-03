/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appsoil.bias;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author alex
 */
@Stateless
public class BiasService {

    @PersistenceContext
    private EntityManager em;

    public void add(Bias bias) {
        em.persist(bias);
    }

    public List<Bias> getAllBiases() {
        TypedQuery<Bias> q = em.createQuery(
                "SELECT b from Bias b", Bias.class);
        return q.getResultList();
    }
}
