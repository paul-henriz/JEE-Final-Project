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
    public static final String ERR_MESSAGE_INVALID= "Connection failed! Verify your login/password and try again.";
    public static final String ERR_MESSAGE_MISSING= "You must enter values in both fields.";
    public static final String JSP_HOME_PAGE = "WEB-INF/views/home.jsp";
    public static final String JSP_WELCOME_PAGE = "WEB-INF/views/welcome.jsp";
    public static final String FRM_LOGIN_FIELD = "loginSent";
    public static final String FRM_PWD_FIELD = "passwordSent";
}
