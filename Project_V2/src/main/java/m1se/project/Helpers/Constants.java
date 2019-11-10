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
    public static final String FRM_ADDRESS_FIELD = "address";
    public static final String FRM_CITY_FIELD = "city";
    public static final String FRM_ZIP_FIELD = "zip";
    public static final String FRM_EMAIL_FIELD = "email";
    
    public static final String FRM_ACTION_LOGIN = "login";
    public static final String FRM_ACTION_DELETE = "delete";
    public static final String FRM_ACTION_DETAIL = "details";
    public static final String FRM_ACTION_ADD = "add";
    public static final String FRM_ACTION_SAVE = "save";
    public static final String FRM_ACTION_CREATE = "create";
    public static final String FRM_ACTION_CANCEL = "cancel";
    public static final String FRM_ACTION_LOGOUT = "logout";
}
