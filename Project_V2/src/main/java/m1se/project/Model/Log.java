/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1se.project.Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author paul-henrizimmerlin
 */
@Entity
@Table(name = "history")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Log.findAll", query = "SELECT l FROM Log l")
    , @NamedQuery(name = "Log.findById", query = "SELECT l FROM Log l WHERE l.id = :id")
    , @NamedQuery(name = "Log.findByDate", query = "SELECT l FROM Log l WHERE l.date = :date")
    , @NamedQuery(name = "Log.findByAction", query = "SELECT l FROM Log l WHERE l.action = :action")
    , @NamedQuery(name = "Log.findByIp", query = "SELECT l FROM Log l WHERE l.ip = :ip")})
@SuppressWarnings("ValidAttributes")
public class Log implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "action")
    private String action;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "ip")
    private String ip;
    @JoinColumn(name = "user", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private User user;

    /**
     * Empty constructor
     */
    public Log() {
    }

    /**
     * Constructor with id
     * @param id
     * The id of the log
     */
    public Log(Integer id) {
        this.id = id;
    }

    /**
     * Full constructor 
     * @param id
     * @param date
     * @param action
     * @param ip
     */
    public Log(Integer id, Date date, String action, String ip) {
        this.id = id;
        this.date = date;
        this.action = action;
        this.ip = ip;
    }

    /**
     * Get the id of a log
     * @return
     * The id of the log
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the id of a log
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get the date of a log
     * @return
     * The date of the log
     */
    public Date getDate() {
        return date;
    }

    /**
     * Set the date of a log
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Get the action of a log
     * @return
     * The action of the log
     */
    public String getAction() {
        return action;
    }

    /**
     * Set the action of a log
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * Get the ip of a log
     * @return
     * The ip of the log
     */
    public String getIp() {
        return ip;
    }

    /**
     * Set the ip of a log
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * Get the user of a log
     * @return
     * The user of a log
     */
    public User getUser() {
        return user;
    }

    /**
     * Set the user of log
     * @param user
     */
    public void setUser(User user) {
        this.user = user;
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
        if (!(object instanceof Log)) {
            return false;
        }
        Log other = (Log) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "m1se.project.Model.Log[ id=" + id + " ]";
    }
    
}
