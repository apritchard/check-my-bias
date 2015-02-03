/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appsoil.bias.rest;

import com.appsoil.BiasSessionBean;
import javax.ejb.EJB;
import javax.faces.bean.RequestScoped;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author alex
 */
@Path("bar")
@RequestScoped
public class TestWS {
    @EJB
    private BiasSessionBean biasSessionBean;

    @GET
    @Produces("text/html")
    public String getTest() {
        return biasSessionBean.getMessage();
    }

// Add business logic below. (Right-click in editor and choose
    // "Web Service > Add Operation"
}
