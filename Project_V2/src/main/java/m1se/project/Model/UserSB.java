/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1se.project.Model;

import java.util.ArrayList;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author paul-henrizimmerlin
 */
@Stateless
public class UserSB {

    @PersistenceContext
    EntityManager em;
    
    ArrayList<User> listUsers;
    
    /**
     * Get the list of all user in the database
     * @return
     * The list of all user
     */
    public ArrayList<User> getUsers(){
        listUsers = new ArrayList<>();
        Query q = em.createNamedQuery("User.findAll");
        listUsers.addAll(q.getResultList());
        return listUsers;
    }
    
    /**
     * Check in the database if there is a matching combinaison of user and password
     * @param input The user input to check
     * @return
     * Boolean if the input is valid (true) or not
     */
    public Boolean validateCredentials(User input){
        boolean result = false;
        listUsers = getUsers();
        input.setPassword(hashPassword(input.getPassword()));
        for (User u : listUsers) {
            if (u.getLogin().equals(input.getLogin()) && u.getPassword().equals(input.getPassword())) {
                input.setId(u.getId());
                input.setIsAdmin(u.getIsAdmin());
                result = true;
            }
        }
        return result;
    }
    public String hashPassword(String password){
        return DigestUtils.sha1Hex(password);
    }
}
