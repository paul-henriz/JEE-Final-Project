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
public class EmployeeSB {
    
    @PersistenceContext
    EntityManager em;
    
    ArrayList<Employee> listEmployees;
    
    public ArrayList<Employee> getEmployees(){
        listEmployees = new ArrayList<>();
        Query q = em.createNamedQuery("Employee.findAll");
        listEmployees.addAll(q.getResultList());
        return listEmployees;
    }
    
    public Employee getEmployeeByID(String ID){
        Query q = em.createNamedQuery("Employee.findById");
        q.setParameter("id", Integer.parseInt(ID));
        return (Employee) q.getSingleResult();
    }
    
    public void deleteEmployeeByID(String ID){
        Query q = em.createNamedQuery("Employee.deleteById");
        q.setParameter("id", Integer.parseInt(ID));
        q.executeUpdate();
    }
    
    public void saveEmployee(Employee emp){
        em.persist(emp);
    }
    public void updateEmployee(Employee emp){
        em.merge(emp);
    }
}
