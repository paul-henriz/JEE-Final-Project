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
    public static final String SEL_QUERY_CREDENTIALS = "SELECT * FROM Credentials";
    public static final String SEL_QUERY_EMPLOYEES = "SELECT * FROM Employees";
    public static final String SEL_QUERY_EMPLOYEE_BY_ID = "SELECT * FROM Employees WHERE ID = ?";
    public static final String DEL_QUERY_EMPLOYEE_BY_ID = "DELETE FROM Employees WHERE ID = ?";
    public static final String INS_QUERY_EMPLOYEE = "INSERT INTO Employees (NAME, FIRSTNAME, TELHOME, TELMOB, TELPRO, ADRESS, POSTALCODE, CITY, EMAIL) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String UPD_QUERY_EMPLOYEE_BY_ID = "UPDATE Employees SET NAME = ?, FIRSTNAME = ?, TELHOME = ?, TELMOB = ?, TELPRO = ?, ADRESS = ?, POSTALCODE = ?, CITY = ?, EMAIL = ? WHERE ID = ?";
    public static final String ERR_MESSAGE_INVALID= "Connection failed! Verify your login/password and try again.";
    public static final String ERR_MESSAGE_MISSING= "You must enter values in both fields.";
    public static final String ERR_MESSAGE_NOT_FOUND = "The selected employee was not found in the database.";
    public static final String JSP_HOME_PAGE = "WEB-INF/views/home.jsp";
    public static final String JSP_WELCOME_PAGE = "WEB-INF/views/welcome.jsp";
    public static final String JSP_DETAIL_PAGE = "WEB-INF/views/details.jsp";
    public static final String JSP_EXIT_PAGE = "WEB-INF/views/exit.jsp";
    public static final String FRM_LOGIN_FIELD = "loginSent";
    public static final String FRM_PWD_FIELD = "passwordSent";
    
    public static final String FRM_NAME_FIELD = "name";
    public static final String FRM_FIRSTNAME_FIELD = "firstname";
    public static final String FRM_TELPRO_FIELD = "telpro";
    public static final String FRM_TELMOB_FIELD = "telmob";
    public static final String FRM_TELDOM_FIELD = "teldom";
    public static final String FRM_ADDRESS_FIELD = "address";
    public static final String FRM_CITY_FIELD = "city";
    public static final String FRM_ZIP_FIELD = "zip";
    public static final String FRM_EMAIL_FIELD = "email";
    
    public static final String FRM_ACTION_LOGIN = "login";
    public static final String FRM_ID_FIELD = "id";
    public static final String FRM_ACTION_DELETE = "delete";
    public static final String FRM_ACTION_DETAIL = "details";
    public static final String FRM_ACTION_ADD = "add";
    public static final String FRM_ACTION_SAVE = "save";
    public static final String FRM_ACTION_CANCEL = "cancel";
    public static final String FRM_ACTION_LOGOUT = "logout";
}
