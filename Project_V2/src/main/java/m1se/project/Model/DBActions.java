/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1se.project.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import m1se.project.Exception.MissingParameter;
import static m1se.project.Helpers.Constants.*;

/**
 *
 * @author paul-henrizimmerlin
 */
public class DBActions {

    Connection conn;
    Statement stmt;
    ResultSet rs;
    PreparedStatement ps;
    ArrayList<User> listUsers;
    ArrayList<Employee> listEmployees;

    /**
     * Default constructor with 3 parameters
     * @param url
     * The URL to access to the database
     * @param user
     * The database user
     * @param pwd 
     * The database password
     */
    public DBActions(String url, String user, String pwd) {
        try {
            conn = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Get statement from the connection
     * @param conn
     * The connection to the database
     * @return
     * The statement
     */
    public Statement getStatement(Connection conn) {
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return stmt;
    }

    /**
     * Return the ResultSet from a request
     * @param stmt
     * The statement
     * @param request
     * The select request to execute
     * @return
     */
    public ResultSet getResultSet(Statement stmt, String request) {
        try {
            rs = stmt.executeQuery(request);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    }

    /**
     * Return the list of all user stored in the database
     * @return
     * List of user in the database
     */
    public ArrayList<User> getUser() {
        listUsers = new ArrayList<>();
        rs = getResultSet(getStatement(conn), SEL_QUERY_CREDENTIALS);
        try {
            while (rs.next()) {
                User u = new User();
                u.setLogin(rs.getString("LOGIN"));
                u.setPassword((rs.getString("PASSWORD")));
                u.setIsAdmin(rs.getBoolean("ISADMIN"));
                listUsers.add(u);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listUsers;
    }

    /**
     * Check if the credentials are corresponding to a combinaison in the db
     * @param input
     * The user to check
     * @return
     * A boolean (true if user is allowed)
     */
    public boolean validateCredentials(User input) {
        boolean result = false;
        listUsers = getUser();
        for (User u : listUsers) {
            if (u.getLogin().equals(input.getLogin()) && u.getPassword().equals(input.getPassword())) {
                input.setIsAdmin(u.getIsAdmin());
                result = true;
            }
        }
        return result;
    }

    /**
     * Query the database to return a list of all employees
     * @return
     * The list of all employees in the database
     */
    public ArrayList<Employee> getEmployees() {
        listEmployees = new ArrayList<>();
        rs = getResultSet(getStatement(conn), SEL_QUERY_EMPLOYEES);
        try {
            while (rs.next()) {
                Employee e = new Employee();
                e.setId(rs.getInt("ID"));
                e.setName(rs.getString("NAME"));
                e.setFirstName(rs.getString("FIRSTNAME"));
                e.setTelHome(rs.getString("TELHOME"));
                e.setTelMob(rs.getString("TELMOB"));
                e.setTelPro(rs.getString("TELPRO"));
                e.setAdress(rs.getString("ADRESS"));
                e.setPostalCode(rs.getString("POSTALCODE"));
                e.setCity(rs.getString("CITY"));
                e.setEmail(rs.getString("EMAIL"));
                listEmployees.add(e);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listEmployees;
    }

    /**
     * Query the database to retrieve the employee selected by its id
     * @param id
     * The id to find in the database
     * @return
     * The employee corresponding to the id
     */
    public Employee getEmployeeByID(String id) {
        try {
            ps = conn.prepareStatement(SEL_QUERY_EMPLOYEE_BY_ID);
            ps.setInt(1, Integer.parseInt(id));
            ps.executeQuery();
            rs = ps.getResultSet();
            while (rs.next()) {
                Employee e = new Employee();
                e.setId(rs.getInt("ID"));
                e.setName(rs.getString("NAME"));
                e.setFirstName(rs.getString("FIRSTNAME"));
                e.setTelHome(rs.getString("TELHOME"));
                e.setTelMob(rs.getString("TELMOB"));
                e.setTelPro(rs.getString("TELPRO"));
                e.setAdress(rs.getString("ADRESS"));
                e.setPostalCode(rs.getString("POSTALCODE"));
                e.setCity(rs.getString("CITY"));
                e.setEmail(rs.getString("EMAIL"));
                return e;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBActions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Delete an employee from its id
     * @param id
     * The id of the employee to delete
     */
    public void deleteEmployeeByID(String id) {
        try {
            ps = conn.prepareStatement(DEL_QUERY_EMPLOYEE_BY_ID);
            ps.setInt(1, Integer.parseInt(id));
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBActions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Fill a prepared statement from an employee
     * @param emp
     * The source employee
     * @param prepStat
     * The prepared statement to fill
     * @throws SQLException
     * @throws MissingParameter
     * If one parameter is missing
     */
    public void fillEmployee(Employee emp, PreparedStatement prepStat) throws SQLException, MissingParameter {
        if (emp.getName().isEmpty() || emp.getFirstName().isEmpty() || emp.getTelHome().isEmpty() || emp.getTelMob().isEmpty() || emp.getTelPro().isEmpty() || emp.getAdress().isEmpty() || emp.getPostalCode().isEmpty() || emp.getCity().isEmpty() || emp.getEmail().isEmpty()) {
            throw new MissingParameter();
        }
        prepStat.setString(1, emp.getName());
        prepStat.setString(2, emp.getFirstName());
        prepStat.setString(3, emp.getTelHome());
        prepStat.setString(4, emp.getTelMob());
        prepStat.setString(5, emp.getTelPro());
        prepStat.setString(6, emp.getAdress());
        prepStat.setString(7, emp.getPostalCode());
        prepStat.setString(8, emp.getCity());
        prepStat.setString(9, emp.getEmail());
    }

    /**
     * Add an employee to the database
     * @param emp
     * The employee to add
     */
    public void addEmployee(Employee emp) {
        try {
            ps = conn.prepareStatement(INS_QUERY_EMPLOYEE);
            fillEmployee(emp, ps);
            ps.executeUpdate();
        } catch (SQLException | MissingParameter ex) {
            Logger.getLogger(DBActions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Update a database employee record from the bean
     * @param emp
     * The employee to update
     */
    public void updateEmployee(Employee emp) {
        try {
            ps = conn.prepareStatement(UPD_QUERY_EMPLOYEE_BY_ID);
            fillEmployee(emp, ps);
            ps.setInt(10, emp.getId());
            ps.executeUpdate();
        } catch (SQLException | MissingParameter ex) {
            Logger.getLogger(DBActions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
