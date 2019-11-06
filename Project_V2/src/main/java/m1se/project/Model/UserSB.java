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

/**
 *
 * @author paul-henrizimmerlin
 */
@Stateless
public class UserSB {

    @PersistenceContext
    EntityManager em;
    
    ArrayList<User> listUsers;
    
    public ArrayList<User> getUsers(){
        listUsers = new ArrayList<>();
        Query q = em.createNamedQuery("User.findAll");
        listUsers.addAll(q.getResultList());
        return listUsers;
    }
    
    public Boolean validateCredentials(User input){
        boolean result = false;
        listUsers = getUsers();
        for (User u : listUsers) {
            if (u.getLogin().equals(input.getLogin()) && u.getPassword().equals(input.getPassword())) {
                input.setIsAdmin(u.getIsAdmin());
                result = true;
            }
        }
        return result;
    }
}
