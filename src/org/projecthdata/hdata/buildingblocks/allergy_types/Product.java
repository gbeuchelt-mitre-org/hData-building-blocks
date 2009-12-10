/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.projecthdata.hdata.buildingblocks.allergy_types;

/**
 *
 * @author GBEUCHELT
 */
public class Product {

    private final String code;
    private final String displayName;
    
    public Product(String code, String displayName) {
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
        return "2.16.840.1.113883.4.9";
    }

    public String getCodeSystemName() {
        return "UNII";
    }

    public org.projecthdata.hdata.schemas._2009._06.allergy_types.Product getProduct() {
        org.projecthdata.hdata.schemas._2009._06.allergy_types.Product result =
                new org.projecthdata.hdata.schemas._2009._06.allergy_types.Product();

        result.setCode(code);
        result.setCodeSystem(getCodeSystem());
        result.setCodeSystemName(getCodeSystemName());
        result.setDisplayName(displayName);
        return result;
    }
}
