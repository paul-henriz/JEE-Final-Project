/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1se.project.Control;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static m1se.project.Helpers.Constants.*;
import m1se.project.Model.DBActions;
import m1se.project.Model.Employee;
import m1se.project.Model.User;

/**
 *
 * @author paul-henrizimmerlin
 */
public class Controller extends HttpServlet {

    HttpSession session;
    DBActions dba;
    InputStream input;
    User currentUser;
    Properties prop;
    String dbURL;
    String dbUser;
    String dbPassword;
    Employee selectedEmployee;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        session = request.getSession();
        prop = new Properties();
        input = getServletContext().getResourceAsStream("/WEB-INF/db.properties");
        prop.load(input);
        dbURL = prop.getProperty("dbUrl");
        dbUser = prop.getProperty("dbUser");
        dbPassword = prop.getProperty("dbPwd");
        currentUser = (User) session.getAttribute("user");
        // If the form is empty
        if (request.getParameter("action") == null) {
            //User is connected
            if (currentUser != null) {
                request.setAttribute("employeesList", dba.getEmployees());
                request.getRequestDispatcher(JSP_WELCOME_PAGE).forward(request, response);
            } else {
                request.getRequestDispatcher(JSP_HOME_PAGE).forward(request, response);
            }
        } else if (request.getParameter("action").equals(FRM_ACTION_LOGIN)) {
            if (request.getParameter(FRM_LOGIN_FIELD).isEmpty() || request.getParameter(FRM_PWD_FIELD).isEmpty()) {
                request.setAttribute("errKey", ERR_MESSAGE_MISSING);
                request.getRequestDispatcher(JSP_HOME_PAGE).forward(request, response);
            } else {
                currentUser = new User();
                currentUser.setLogin(request.getParameter(FRM_LOGIN_FIELD));
                currentUser.setPassword(request.getParameter(FRM_PWD_FIELD));

                dba = new DBActions(dbURL, dbUser, dbPassword);
                if (dba.validateCredentials(currentUser)) {
                    session.setAttribute("user", currentUser);
                    request.setAttribute("employeesList", dba.getEmployees());
                    request.getRequestDispatcher(JSP_WELCOME_PAGE).forward(request, response);
                } else {
                    request.setAttribute("errKey", ERR_MESSAGE_INVALID);
                    request.getRequestDispatcher(JSP_HOME_PAGE).forward(request, response);
                }
            }
        } else if (request.getParameter("action").equals(FRM_ACTION_DETAIL)) {
            if (currentUser != null) {
                dba = new DBActions(dbURL, dbUser, dbPassword);
                selectedEmployee = dba.getEmployeeByID(request.getParameter(FRM_ID_FIELD));
                if (selectedEmployee != null) {
                    request.setAttribute("emp", selectedEmployee);
                    request.getRequestDispatcher(JSP_DETAIL_PAGE).forward(request, response);
                } else {
                    request.setAttribute("errKey", ERR_MESSAGE_NOT_FOUND);
                    request.getRequestDispatcher(JSP_WELCOME_PAGE).forward(request, response);
                }
            } else {
                request.getRequestDispatcher(JSP_HOME_PAGE).forward(request, response);
            }
        } else if (request.getParameter("action").equals(FRM_ACTION_DELETE)) {
            if (currentUser != null) {
                if (currentUser.getIsAdmin()) {
                    dba = new DBActions(dbURL, dbUser, dbPassword);
                    dba.deleteEmployeeByID(request.getParameter(FRM_ID_FIELD));
                    request.setAttribute("employeesList", dba.getEmployees());
                    request.getRequestDispatcher(JSP_WELCOME_PAGE).forward(request, response);
                } else {
                    request.setAttribute("employeesList", dba.getEmployees());
                    request.getRequestDispatcher(JSP_WELCOME_PAGE).forward(request, response);
                }
            } else {
                request.getRequestDispatcher(JSP_HOME_PAGE).forward(request, response);
            }
        } else if (request.getParameter("action").equals(FRM_ACTION_ADD)) {
            if (currentUser != null) {
                if (currentUser.getIsAdmin()) {
                    dba = new DBActions(dbURL, dbUser, dbPassword);
                    request.getRequestDispatcher(JSP_DETAIL_PAGE).forward(request, response);
                } else {
                    request.setAttribute("employeesList", dba.getEmployees());
                    request.getRequestDispatcher(JSP_WELCOME_PAGE).forward(request, response);
                }
            } else {
                request.getRequestDispatcher(JSP_HOME_PAGE).forward(request, response);
            }
        } else if (request.getParameter("action").equals(FRM_ACTION_LOGOUT)) {
                request.getRequestDispatcher(JSP_EXIT_PAGE).forward(request, response);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
