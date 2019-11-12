/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1se.project.Model;

import java.time.Instant;
import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author paul-henrizimmerlin
 */
@Stateless
public class LogSB {
    
    @PersistenceContext
    EntityManager em;
    
    /**
     * Add a log entry to the database
     * @param u The user associate to the action
     * @param ip The ip address of the user
     * @param action The action executed
     */
    public void addLog(User u, String ip, String action){
        Log l = new Log();
        l.setUser(u);
        l.setAction(action);
        l.setDate(Date.from(Instant.now()));
        l.setIp(ip);
        em.persist(l);
    }
}
