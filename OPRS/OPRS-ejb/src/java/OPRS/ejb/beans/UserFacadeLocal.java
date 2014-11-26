/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OPRS.ejb.beans;

//import BookStore.ejb.persistence.Item;
import OPRS.ejb.persistence.User;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ssome
 */
@Local
public interface UserFacadeLocal {

    void create(User item);

    void edit(User item);

    void remove(User item);

    User find(Object id);

    List<User> findAll();

    List<User> findRange(int[] range);

    int count();
    
    public boolean addUser(String userID, String fName, String lName, String uName, String pwd, String email, String num);
    
}
