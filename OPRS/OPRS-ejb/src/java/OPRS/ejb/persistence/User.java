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
public class User implements Serializable {
     private static long serialVersionUID = 1L;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }
        @Id
    private String userID;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private String phoneNumber; 

    public User() {

    }

    /** Creates a new instance of Item
     * @param userID
     * @param fName
     * @param lName
     * @param uName
     * @param pwd
     * @param num
     * @param email*/
    public User(String userID, String fName, String lName, String uName, String pwd, String email, String num) {
       this.userID = userID;
       this.firstName = fName;
       this.lastName = lName;
       this.username = uName;
       this.password = pwd;
       this.email = email;
       this.phoneNumber = num;
    }
    
    public int hashCode() {
        int hash = 0;
        hash += (this.getUserID() != null ? this.getUserID().hashCode() : 0);
        return hash;
    }

     @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User)object;
        if (this.getUserID() != other.getUserID() && (this.getUserID() == null || !this.userID.equals(other.userID))) return false;
        return true;
    }

     @Override
    public String toString() {
        return "Library.persistence.User[id=" + getUserID() + "]";
    }

    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
