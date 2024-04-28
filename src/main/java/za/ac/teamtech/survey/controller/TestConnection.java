/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.teamtech.survey.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.teamtech.survey.daoImp.SurveryDaoImp;
import za.ac.teamtech.survey.daoImp.UserDaoImp;
import za.ac.teamtech.survey.dblistener.manager.DBManager;
import za.ac.teamtech.survey.model.User;
import za.ac.teamtech.survey.services.SurveyServiceImp;
import za.ac.teamtech.survey.services.UserServiceImp;

/**
 *
 * @author RONALD
 */
@WebServlet(name = "TestConnection", urlPatterns = {"/TestConnection"})
public class TestConnection extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         DBManager dbm = (DBManager) request.getServletContext().getAttribute("dbman");
        Connection con = dbm.getConnection();
        List<String> questions = new ArrayList<>();
        
        SurveyServiceImp service = new SurveyServiceImp(new SurveryDaoImp(con));
       questions = service.question("question");
       System.out.print(questions);
       HttpSession session = request.getSession(); 
       session.setAttribute("questions",questions );
        RequestDispatcher rd = request.getRequestDispatcher("survey.jsp");
           rd.forward(request, response);
//        UserServiceImp userService = new UserServiceImp(new UserDaoImp(con));
//      if(userService.createUser(new User("Makalapetlo Maropene", "cassiusmaropene@gmail.com", "12-06-1999", "0827612678"))){
//       System.out.println("Created!!");
//      }else{
//          System.out.print("Not Created!");
//      }
       
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
