/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BookStore.war.beans;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author pboud071
 */


@Named(value = "preferencesBean")
@SessionScoped
public class PreferencesBean implements Serializable  {
     @EJB
    private PropertyFacadeLocal propertyFacade;
     
    
    private String propertyType;
    private double numBedrooms;
    private double numBathrooms;
    private double numOtherRooms;
    private double maxRentalFee;

    public PropertyFacadeLocal getPropertyFacade() {
        return propertyFacade;
    }

    public void setPropertyFacade(PropertyFacadeLocal propertyFacade) {
        this.propertyFacade = propertyFacade;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public double getNumBedrooms() {
        return numBedrooms;
    }

    public void setNumBedrooms(double numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

    public double getNumBathrooms() {
        return numBathrooms;
    }

    public void setNumBathrooms(double numBathrooms) {
        this.numBathrooms = numBathrooms;
    }

    public double getNumOtherRooms() {
        return numOtherRooms;
    }

    public void setNumOtherRooms(double numOtherRooms) {
        this.numOtherRooms = numOtherRooms;
    }

    public double getMaxRentalFee() {
        return maxRentalFee;
    }

    public void setMaxRentalFee(double maxRentalFee) {
        this.maxRentalFee = maxRentalFee;
    }


    
  
    
    /**
     * Creates a new instance of PreferencesBean
     */
    public PreferencesBean() {
    }

  

}


   
