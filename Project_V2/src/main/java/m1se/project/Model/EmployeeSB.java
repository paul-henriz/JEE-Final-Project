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
    
    /**
     * Get the list of all employees
     * @return
     * The list of all employees
     */
    public ArrayList<Employee> getEmployees(){
        listEmployees = new ArrayList<>();
        Query q = em.createNamedQuery("Employee.findAll");
        listEmployees.addAll(q.getResultList());
        return listEmployees;
    }
    
    /**
     * Get an employee by its ID
     * @param ID
     * @return
     * The employee corresponding to the id
     */
    public Employee getEmployeeByID(String ID){
        Query q = em.createNamedQuery("Employee.findById");
        q.setParameter("id", Integer.parseInt(ID));
        return (Employee) q.getSingleResult();
    }
    
    /**
     * Delete an employee from its id
     * @param ID
     */
    public void deleteEmployeeByID(String ID){
        Query q = em.createNamedQuery("Employee.deleteById");
        q.setParameter("id", Integer.parseInt(ID));
        q.executeUpdate();
    }
    
    /**
     * Save (an new employee) into the database
     * @param emp
     */
    public void saveEmployee(Employee emp){
        em.persist(emp);
    }

    /**
     * Update (an existing employee) into the database
     * @param emp
     */
    public void updateEmployee(Employee emp){
        em.merge(emp);
    }
}
