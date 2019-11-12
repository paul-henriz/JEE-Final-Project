/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1se.project.Helpers;

/**
 *
 * @author paul-henrizimmerlin
 */
public class Constants {

    /**
     * The SQL query to select all credentials (user)
     */
    public static final String SEL_QUERY_CREDENTIALS = "SELECT * FROM Credentials";

    /**
     * The SQL query to select all employees
     */
    public static final String SEL_QUERY_EMPLOYEES = "SELECT * FROM Employees";

    /**
     * The SQL query to select employee by id
     */
    public static final String SEL_QUERY_EMPLOYEE_BY_ID = "SELECT * FROM Employees WHERE ID = ?";

    /**
     * The SQL query to delete an employee by its id
     */
    public static final String DEL_QUERY_EMPLOYEE_BY_ID = "DELETE FROM Employees WHERE ID = ?";

    /**
     * The SQL query to insert an employee
     */
    public static final String INS_QUERY_EMPLOYEE = "INSERT INTO Employees (NAME, FIRSTNAME, TELHOME, TELMOB, TELPRO, ADRESS, POSTALCODE, CITY, EMAIL) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    /**
     * The SQL query to update an employee
     */
    public static final String UPD_QUERY_EMPLOYEE_BY_ID = "UPDATE Employees SET NAME = ?, FIRSTNAME = ?, TELHOME = ?, TELMOB = ?, TELPRO = ?, ADRESS = ?, POSTALCODE = ?, CITY = ?, EMAIL = ? WHERE ID = ?";
    
    /**
     * The message to display if no matching result for combinaison user/password is found in the database
     */
    public static final String ERR_MESSAGE_INVALID= "Connection failed! Verify your login/password and try again.";

    /**
     * The message to display if one or more field is empty
     */
    public static final String ERR_MESSAGE_MISSING= "You must enter values in both fields.";

    /**
     * The message to display if the employee is not found in the database
     */
    public static final String ERR_MESSAGE_NOT_FOUND = "The selected employee was not found in the database.";
    
    /**
     * Path to home (login) page
     */
    public static final String JSP_HOME_PAGE = "WEB-INF/views/home.jsp";

    /**
     * Path to welcome (list of all employess) page
     */
    public static final String JSP_WELCOME_PAGE = "WEB-INF/views/welcome.jsp";

    /**
     * Path to details (add or update an employee) page 
     */
    public static final String JSP_DETAIL_PAGE = "WEB-INF/views/details.jsp";

    /**
     * Path to exit (logout) page
     */
    public static final String JSP_EXIT_PAGE = "WEB-INF/views/exit.jsp";

    /**
     * Name of the login field in the home page
     */
    public static final String FRM_LOGIN_FIELD = "loginSent";

    /**
     * Name of the password field in the home page
     */
    public static final String FRM_PWD_FIELD = "passwordSent";
    
    /**
     * Name of the id field
     */
    public static final String FRM_ID_FIELD = "id";

    /**
     * Name of the name field
     */
    public static final String FRM_NAME_FIELD = "name";

    /**
     * Name of the first name field
     */
    public static final String FRM_FIRSTNAME_FIELD = "firstname";

    /**
     * Name of the professionnal phone number
     */
    public static final String FRM_TELPRO_FIELD = "telpro";

    /**
     * Name of the mobile phone number
     */
    public static final String FRM_TELMOB_FIELD = "telmob";

    /**
     * Name of the home phone number
     */
    public static final String FRM_TELDOM_FIELD = "teldom";

    /**
     * Name of the address field
     */
    public static final String FRM_ADDRESS_FIELD = "address";

    /**
     * Name of the city field
     */
    public static final String FRM_CITY_FIELD = "city";

    /**
     * Name of the zip or postal code field
     */
    public static final String FRM_ZIP_FIELD = "zip";

    /**
     * Name of the email field
     */
    public static final String FRM_EMAIL_FIELD = "email";
    
    /**
     * Name of the login action
     */
    public static final String FRM_ACTION_LOGIN = "login";

    /**
     * Name of the delete action
     */
    public static final String FRM_ACTION_DELETE = "delete";

    /**
     * Name of the details action
     */
    public static final String FRM_ACTION_DETAIL = "details";

    /**
     * Name of the add action
     */
    public static final String FRM_ACTION_ADD = "add";

    /**
     * Name of the save action
     */
    public static final String FRM_ACTION_SAVE = "save";

    /**
     * Name of the create action
     */
    public static final String FRM_ACTION_CREATE = "create";

    /**
     * Name of the cancel action
     */
    public static final String FRM_ACTION_CANCEL = "cancel";

    /**
     * Name of the logout action
     */
    public static final String FRM_ACTION_LOGOUT = "logout";
}
