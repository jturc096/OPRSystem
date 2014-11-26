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
public class Customer extends User {
    //Customer
    private String visitingList;
    private String memberName;

    public Customer() {
        
    }

    /** Creates a new instance of Item
     * @param userID
     * @param fName
     * @param lName
     * @param uName
     * @param pwd
     * @param num
     * @param email
     * @param visitingList
     * @param memberName*/
    
    public Customer(String userID, String fName, String lName, String uName, String pwd, String email, String num, String visitingList, String memberName) {
       super(userID, fName, lName, uName, pwd, email, num);
       this.visitingList = visitingList;
       this.memberName = memberName;
    }

    /**
     * @return the visitingList
     */
    public String getVisitingList() {
        return visitingList;
    }

    /**
     * @param visitingList the visitingList to set
     */
    public void setVisitingList(String visitingList) {
        this.visitingList = visitingList;
    }

    /**
     * @return the memberName
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * @param memberName the memberName to set
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
}
