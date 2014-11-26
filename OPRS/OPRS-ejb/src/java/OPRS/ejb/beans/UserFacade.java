/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OPRS.ejb.beans;

//import BookStore.ejb.persistence.Item;
import OPRS.ejb.persistence.User;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author ssome
 */
@Stateless
public class UserFacade extends AbstractFacade<User> implements UserFacadeLocal {
    @PersistenceContext(unitName = "OPRS-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(User.class);
    }

    @Override
    public boolean addUser(String userID, String fName, String lName, String uName, String pwd, String email, String num) {
        User user= new User(userID, fName, lName, uName, pwd, email, num);
        try {
            create(user);
        } catch (Exception e) {
            return false ;
        }
        return true;
    } 

    @Override
    public void create(User item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(User item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(User item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> findRange(int[] range) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
