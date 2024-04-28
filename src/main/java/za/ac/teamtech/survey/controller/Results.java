/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.teamtech.survey.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.teamtech.survey.daoImp.FavFoodDaoImp;
import za.ac.teamtech.survey.daoImp.SurveryDaoImp;
import za.ac.teamtech.survey.daoImp.UserDaoImp;
import za.ac.teamtech.survey.dblistener.manager.DBManager;
import za.ac.teamtech.survey.model.UserResults;
import za.ac.teamtech.survey.services.FavFoodService;
import za.ac.teamtech.survey.services.SurveyServiceImp;
import za.ac.teamtech.survey.services.UserServiceImp;

/**
 *
 * @author RONALD
 */
@WebServlet(name = "Results", urlPatterns = {"/Results"})
public class Results extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        DBManager dbm = (DBManager) request.getServletContext().getAttribute("dbman");
        Connection con = dbm.getConnection();
        HttpSession session = request.getSession(); 
     
        UserServiceImp imp = new UserServiceImp(new UserDaoImp(con));
        double total = imp.totalSurveyNum();
        double youngest = imp.youngestPerson();
        double oldest = imp.oldestPerson();
        double avarage = imp.avarageAge();
        
        //UserResults(int total, double avAge, int youngPersonAge, int oldestPersonAge)  // mesl   // survey
       
        
        //FavFoodService(FavFoodDaoImp dao)
        FavFoodService sec = new FavFoodService(new FavFoodDaoImp(con));
        
        double pizzaFav = sec.pizzaFav();
        double pasta = sec.pastaFav();
        double papAndWors = sec.papWorsFav();
        
        // survey
        SurveyServiceImp s = new SurveyServiceImp(new SurveryDaoImp(con));
        double a = s.calculateAverageRatingQ1();
        double b = s.calculateAverageRatingQ2();
        double c = s.calculateAverageRatingQ3();
        double d = s.calculateAverageRatingQ4();
        
        
        UserResults results = new UserResults(total , avarage , youngest ,oldest,pizzaFav,pasta,papAndWors,a,b,c,d );
        session.setAttribute("results",results );
        RequestDispatcher rd = request.getRequestDispatcher("results.jsp");
        rd.forward(request, response);
        
       
        
        
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
