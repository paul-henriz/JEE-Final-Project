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
    public static final String ERR_MESSAGE_INVALID= "Connection failed! Verify your login/password and try again.";
    public static final String ERR_MESSAGE_MISSING= "You must enter values in both fields.";
    public static final String ERR_MESSAGE_NOT_FOUND = "The selected employee was not found in the database.";
    public static final String JSP_HOME_PAGE = "WEB-INF/views/home.jsp";
    public static final String JSP_WELCOME_PAGE = "WEB-INF/views/welcome.jsp";
    public static final String JSP_DETAIL_PAGE = "WEB-INF/views/details.jsp";
    public static final String JSP_EXIT_PAGE = "";
    public static final String FRM_LOGIN_FIELD = "loginSent";
    public static final String FRM_PWD_FIELD = "passwordSent";
    public static final String FRM_ACTION_LOGIN = "login";
    public static final String FRM_ID_FIELD = "id";
    public static final String FRM_ACTION_DELETE = "delete";
    public static final String FRM_ACTION_DETAIL = "details";
    public static final String FRM_ACTION_ADD = "add";
}
