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
public class Employee {
    private int id;
    private String name;
    private String firstName;
    private String telHome;
    private String telMobile;
    private String telPro;
    private String address;
    private String zipCode;
    private String city;
    private String email;

    /**
     * Get the id of an employee
     * @return ID of the employee as an integer
     */
    public int getId() {
        return id;
    }

    /**
     * Set the id of an employee
     * @param id
     */
    public void setId(int id) {
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
    public String getTelMobile() {
        return telMobile;
    }

    /**
     * Set the mobile phone number of an employee
     * @param telMobile
     */
    public void setTelMobile(String telMobile) {
        this.telMobile = telMobile;
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
    public String getAddress() {
        return address;
    }

    /**
     * Set the address of an employee
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get the zip or postal code of an employee
     * @return The zip code of the employee
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Set the zip or postal code of an employee
     * @param zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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
}