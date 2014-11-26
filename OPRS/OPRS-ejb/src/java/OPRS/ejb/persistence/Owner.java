/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OPRS.ejb.persistence;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author ssome
 */
@Entity
public class Owner extends User{

    //Owner
    private String propertyList;

    public Owner() {
        
    }

    /** Creates a new instance of Item
     * @param userID
     * @param fName
     * @param lName
     * @param uName
     * @param pwd
     * @param num
     * @param email*/
    public Owner(String userID, String fName, String lName, String uName, String pwd, String email, String num, String pl) {
       super(userID, fName, lName, uName, pwd, email, num);
       this.propertyList = pl;
    }

    /**
     * @return the propertyList
     */
    public String getPropertyList() {
        return propertyList;
    }

    /**
     * @param propertyList the propertyList to set
     */
    public void setPropertyList(String propertyList) {
        this.propertyList = propertyList;
    }
}
