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
public class Agent extends User{
    
    //Agent
    private String employeeNumber;
    private String startDate;

    public Agent() {

    }

    /** Creates a new instance of Item
     * @param userID
     * @param fName
     * @param lName
     * @param uName
     * @param pwd
     * @param num
     * @param email
     * @param eID
     * @param sd*/
    public Agent(String userID, String fName, String lName, String uName, String pwd, String email, String num, String eID, String sd) {
       super(userID, fName, lName, uName, pwd, email, num);
       this.employeeNumber = eID;
       this.startDate = sd;
    }

     @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agent)) {
            return false;
        }
        Agent other = (Agent)object;
        if (this.getEmployeeNumber() != other.getEmployeeNumber() && (this.getEmployeeNumber() == null || !this.getEmployeeNumber().equals(other.getEmployeeNumber()))) return false;
        return true;
    }

    /**
     * @return the employeeNumber
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * @param employeeNumber the employeeNumber to set
     */
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
