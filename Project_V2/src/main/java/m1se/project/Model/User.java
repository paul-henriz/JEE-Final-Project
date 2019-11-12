/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1se.project.Model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author paul-henrizimmerlin
 */
@Entity
@Table(name = "credentials")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
    , @NamedQuery(name = "User.findById", query = "SELECT u FROM User u WHERE u.id = :id")
    , @NamedQuery(name = "User.findByLogin", query = "SELECT u FROM User u WHERE u.login = :login")
    , @NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u WHERE u.password = :password")
    , @NamedQuery(name = "User.findByIsAdmin", query = "SELECT u FROM User u WHERE u.isAdmin = :isAdmin")})
public class User implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Collection<Log> logCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "Login")
    private String login;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "Password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IsAdmin")
    private boolean isAdmin;

    /**
     * Empty constructor
     */
    public User() {
    }

    /**
     * Constructor with id
     * @param id
     * The id of the user
     */
    public User(Integer id) {
        this.id = id;
    }

    /**
     * Full constructor
     * @param id
     * @param login
     * @param password
     * @param isAdmin
     */
    public User(Integer id, String login, String password, boolean isAdmin) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    /**
     * Get the id of an user
     * @return
     * The id of the user as an integer
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the id of an user
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
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
    public boolean getIsAdmin() {
        return isAdmin;
    }

    /**
     * Set the status of an user
     * @param isAdmin
     */
    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "m1se.project.Control.User[ id=" + id + " ]";
    }

    /**
     * Get a collection of logs
     * @return
     * The collection of logs
     */
    @XmlTransient
    public Collection<Log> getLogCollection() {
        return logCollection;
    }

    /**
     * Set a collection of logs
     * @param logCollection
     */
    public void setLogCollection(Collection<Log> logCollection) {
        this.logCollection = logCollection;
    }
    
}
