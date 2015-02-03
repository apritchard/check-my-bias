/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appsoil.bias.rest;

import com.appsoil.bias.Bias;
import com.appsoil.bias.BiasService;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.RequestScoped;
import javax.ws.rs.Consumes;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author alex
 */
@Path("bar")
@RequestScoped
public class TestWS {

    @EJB
    private BiasService biasService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bias> getBiases() {
        return biasService.getAllBiases();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void setBiases(List<Bias> biases) {
        for (Bias b : biases) {
            biasService.add(b);
        }
    }
}
