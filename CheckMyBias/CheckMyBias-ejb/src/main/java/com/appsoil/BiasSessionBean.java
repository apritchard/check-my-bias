/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appsoil;

import javax.ejb.Stateless;

/**
 *
 * @author alex
 */
@Stateless
public class BiasSessionBean {

    public String getMessage() {
        return "foo2";
    }
}
