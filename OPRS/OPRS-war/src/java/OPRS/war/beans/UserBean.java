/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package OPRS.war.beans;

import OPRS.ejb.beans.UserFacadeLocal;
import java.util.ResourceBundle;
import javax.ejb.EJB;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author ssome
 */
@Named(value = "userBean")
@RequestScoped
public final class UserBean {
    private UserFacadeLocal userFacade;
    private String userID;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private String phoneNumber;  
    private String status;

  public UserBean(String userID, String fName, String lName, String uName, String pwd, String email, String num) {
       setUserID(userID);
       setFirstName(fName);
       setLastName(lName);
       setUsername(uName);
       setPassword(pwd);
       setEmail(email);
       setPhoneNumber(num);
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
    
    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    public void addUser() {
        FacesContext context = FacesContext.getCurrentInstance();
        ResourceBundle bundle = context.getApplication().getResourceBundle(context, "msg");
        
        if (userFacade.addUser(userID, firstName, lastName, username, password, email, phoneNumber)) {
           status = bundle.getString("addOk");
        } else {
           status = bundle.getString("addFail");
        }
    }
    
}
