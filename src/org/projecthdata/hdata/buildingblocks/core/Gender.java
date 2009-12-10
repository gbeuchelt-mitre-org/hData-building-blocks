/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.projecthdata.hdata.buildingblocks.core;

/**
 *
 * @author GBEUCHELT
 */
public enum Gender {

    MALE("M", "male"),
    FEMALE("F", "female"),
    UNDIFFERENTIATED("U", "undifferentiated");

    private final String code;
    private final String displayName;
    
    Gender(String code, String displayName) {
        this.code = code; 
        this.displayName = displayName; 
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDisplayName() {
        return displayName; 
    }
    
    public String getCodeSystem() {
        return "2.16.840.1.113883.5.1"; 
    }

    public String getCodeSystemName() {
        return "HL7 Administrative Gender";
    }

    public org.projecthdata.hdata.schemas._2009._06.core.Gender getGender() {
        org.projecthdata.hdata.schemas._2009._06.core.Gender result =
                new org.projecthdata.hdata.schemas._2009._06.core.Gender();

        result.setCode(code);
        result.setCodeSystem("2.16.840.1.113883.5.1");
        result.setCodeSystemName("HL7 Administrative Gender");
        result.setDisplayName(displayName);
        return result;
    }
}
