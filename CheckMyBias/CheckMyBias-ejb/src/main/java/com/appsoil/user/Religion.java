/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appsoil.user;

/**
 *
 * @author alex
 */
public enum Religion {
    CHRISTIAN("Christianity"),ISLAM("Islam"), AGNOSTIC("Agnostic"), ATHEIST("Atheist"),
    HINDU("Hinduism"), CHINESE("Chinese traditional"), BUDDHIST("Buddhism"), OTHER_ETHNIC("Other Ethnic religion"),
    AFRICAN("African traditional"), SIKH("Sikhism"), JUCHE("Juche"), SPIRITIST("Spiritism"),
    JEWISH("Judaism"), BAHAI("Bahá'í"), JAINIST("Jainism"), SHINTOIST("Shinto"),
    CAO_DAIST("Cao Dai"), ZOROASTRIANIST("Zoroastrianism"), TENRIKYO("Tenrikyo"),
    NEO_PAGANIST("Neo-Paganism"), UNITARIAN("Unitarian Universalism"), RASTAFARIAN("Rastafarianism"), OTHER("Other");
    
    private final String description;
    Religion(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }    
}
