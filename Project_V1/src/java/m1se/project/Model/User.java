/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1se.project.Model;

/**
 *
 * @author paul-henrizimmerlin
 */
public class User {
    private String login;
    private String password;
    private Boolean isAdmin;

    /**
     * Get the login of an user
     * @return The login of the user
     */
    public String getLogin() {
        return login;
    }

    /**
     * Set the login of an user
     * @param login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Get the password of an user
     * @return The password of the user
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the password of an user
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the status of an user (true if admin)
     * @return The status of the user
     */
    public Boolean getIsAdmin() {
        return isAdmin;
    }

    /**
     * Set the status of an user
     * @param isAdmin
     */
    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}
