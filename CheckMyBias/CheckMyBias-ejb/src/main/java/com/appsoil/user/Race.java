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
public enum Race {
    MIXED("Mixed Race"), ARTIC("Arctic (Siberian, Eskimo)"), EUROPEAN("Caucasian (European"),
    INDIAN("Caucasian (Indian)"), MIDDLE_EAST("Caucasian (Middle East)"), NORTH_AFRICAN("Caucasian (North African, Other)"),
    AUSTRALIAN("Indigenous Australian"), NATIVE_AMERICAN("Native American"), NE_ASIAN("North EAst Asian (Mongol, Tibetan, Korean, Japanese, Other"),
    PACIFIC("Pacific (Polynesian, Micronesian, Other)"), SE_ASIAN("South East Asian (Chinese, Thai, Malay, Filipino, Other"),
    WEST_AFRICAN("West African, Bushmen, Ethiopian"), OTHER("Other Race");
    
    private final String description;
    Race(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
