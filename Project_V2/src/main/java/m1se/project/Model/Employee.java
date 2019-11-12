/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1se.project.Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author paul-henrizimmerlin
 */
@Entity
@Table(name = "employees")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e")
    , @NamedQuery(name = "Employee.findById", query = "SELECT e FROM Employee e WHERE e.id = :id")
    , @NamedQuery(name = "Employee.findByName", query = "SELECT e FROM Employee e WHERE e.name = :name")
    , @NamedQuery(name = "Employee.findByFirstName", query = "SELECT e FROM Employee e WHERE e.firstName = :firstName")
    , @NamedQuery(name = "Employee.findByTelHome", query = "SELECT e FROM Employee e WHERE e.telHome = :telHome")
    , @NamedQuery(name = "Employee.findByTelMob", query = "SELECT e FROM Employee e WHERE e.telMob = :telMob")
    , @NamedQuery(name = "Employee.findByTelPro", query = "SELECT e FROM Employee e WHERE e.telPro = :telPro")
    , @NamedQuery(name = "Employee.findByAdress", query = "SELECT e FROM Employee e WHERE e.adress = :adress")
    , @NamedQuery(name = "Employee.findByPostalCode", query = "SELECT e FROM Employee e WHERE e.postalCode = :postalCode")
    , @NamedQuery(name = "Employee.findByCity", query = "SELECT e FROM Employee e WHERE e.city = :city")
    , @NamedQuery(name = "Employee.findByEmail", query = "SELECT e FROM Employee e WHERE e.email = :email")
    , @NamedQuery(name = "Employee.deleteById", query = "DELETE FROM Employee e WHERE e.id = :id")})
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "FirstName")
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "TelHome")
    private String telHome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "TelMob")
    private String telMob;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "TelPro")
    private String telPro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Adress")
    private String adress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "PostalCode")
    private String postalCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "City")
    private String city;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "Email")
    private String email;

    /**
     * Default empty constructor
     */
    public Employee() {
    }

    /**
     * Constructor with id
     * @param id 
     * The id of the employee
     */
    public Employee(Integer id) {
        this.id = id;
    }

    /**
     * Full constructor
     * @param id
     * @param name
     * @param firstName
     * @param telHome
     * @param telMob
     * @param telPro
     * @param adress
     * @param postalCode
     * @param city
     * @param email
     */
    public Employee(Integer id, String name, String firstName, String telHome, String telMob, String telPro, String adress, String postalCode, String city, String email) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.telHome = telHome;
        this.telMob = telMob;
        this.telPro = telPro;
        this.adress = adress;
        this.postalCode = postalCode;
        this.city = city;
        this.email = email;
    }

    /**
     * Get the id of an employee
     * @return ID of the employee as an integer
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the id of an employee
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get the name of an employee
     * @return Name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Set  the name of an employee
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the first name of an employee
     * @return First name of the employee
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set  the first name of an employee
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get the home phone number of an employee
     * @return Home phone number of the employee
     */
    public String getTelHome() {
        return telHome;
    }

    /**
     * Set the home phone number of an employee
     * @param telHome
     */
    public void setTelHome(String telHome) {
        this.telHome = telHome;
    }

    /**
     * Get the mobile phone number of an employee
     * @return Home phone number of the employee
     */
    public String getTelMob() {
        return telMob;
    }

    /**
     * Set the mobile phone number of an employee
     * @param telMob
     */
    public void setTelMob(String telMob) {
        this.telMob = telMob;
    }

    /**
     * Get the professional phone number of an employee
     * @return Home phone number of the employee
     */
    public String getTelPro() {
        return telPro;
    }

    /**
     * Set the professional phone number of an employee
     * @param telPro
     */
    public void setTelPro(String telPro) {
        this.telPro = telPro;
    }

    /**
     * Get the address of an employee
     * @return The address of the employee
     */
    public String getAdress() {
        return adress;
    }

    /**
     * Set the address of an employee
     * @param adress
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * Get the zip or postal code of an employee
     * @return The zip code of the employee
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Set the zip or postal code of an employee
     * @param postalCode
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Get the city of an employee
     * @return The city of the employee
     */
    public String getCity() {
        return city;
    }

    /**
     * Set the city of an employee
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Get the email address of an employee
     * @return The email address of the employee
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the email address of an employee
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
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
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "m1se.project.Control.Employee[ id=" + id + " ]";
    }
    
}
