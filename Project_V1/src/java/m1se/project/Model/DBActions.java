/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1se.project.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static m1se.project.Helpers.Constants.*;

/**
 *
 * @author paul-henrizimmerlin
 */
public class DBActions {

    Connection conn;
    Statement stmt;
    ResultSet rs;

    public DBActions(String url, String user, String pwd) {
        try {
            conn = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Statement getStatement(Connection conn) {
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return stmt;
    }

    public ResultSet getResultSet(Statement stmt, String request) {
        try {
            rs = stmt.executeQuery(request);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    }

    public ArrayList<User> getUser() {
        ArrayList<User> listUsers = new ArrayList<>();
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
    
    public boolean validateCredentials(User input){
        boolean result = false;
        ArrayList<User> listUsers = getUser();
        for(User u : listUsers){
            if(u.getLogin().equals(input.getLogin()) && u.getPassword().equals(input.getPassword())) result = true;
        }
        return result;
    }

    public ArrayList<Employee> getEmployees() {
        ArrayList<Employee> listEmployees = new ArrayList<>();
        rs = getResultSet(getStatement(conn), SEL_QUERY_EMPLOYEES);
        try {
            while (rs.next()) {
                Employee e = new Employee();
                e.setId(rs.getInt("ID"));
                e.setName(rs.getString("NAME"));
                e.setFirstName(rs.getString("FIRSTNAME"));
                e.setTelHome(rs.getString("TELHOME"));
                e.setTelMobile(rs.getString("TELMOB"));
                e.setTelPro(rs.getString("TELPRO"));
                e.setAddress(rs.getString("ADRESS"));
                e.setZipCode(rs.getString("POSTALCODE"));
                e.setCity(rs.getString("CITY"));
                e.setEmail(rs.getString("EMAIL"));
                listEmployees.add(e);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listEmployees;
    }
}
