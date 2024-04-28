/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.teamtech.survey.controller;

import com.google.protobuf.TextFormat.ParseException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.teamtech.survey.daoImp.SurveryDaoImp;
import za.ac.teamtech.survey.daoImp.UserDaoImp;
import za.ac.teamtech.survey.dblistener.manager.DBManager;
import za.ac.teamtech.survey.model.Answers;
import za.ac.teamtech.survey.model.Question1;
import za.ac.teamtech.survey.model.Question2;
import za.ac.teamtech.survey.model.Question3;
import za.ac.teamtech.survey.model.Question4;
import za.ac.teamtech.survey.model.Survey;
import za.ac.teamtech.survey.model.User;
import za.ac.teamtech.survey.services.SurveyServiceImp;
import za.ac.teamtech.survey.services.UserServiceImp;

/**
 *
 * @author RONALD
 */
@WebServlet(name = "Update", urlPatterns = {"/Update"})
public class Update extends HttpServlet {

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
       // Get the parameter values from the form
       
    DBManager dbm = (DBManager) request.getServletContext().getAttribute("dbman");
    Connection con = dbm.getConnection();
    
    
    String names = request.getParameter("full_name");
    String email = request.getParameter("email");
    String date_of_birth = request.getParameter("date_of_birth");
    String contact = request.getParameter("contact");
    
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

      
       
    
    
    
    UserServiceImp userService = new UserServiceImp(new UserDaoImp(con));
    SurveyServiceImp imp = new SurveyServiceImp(new SurveryDaoImp(con));
      if(userService.createUser(new User( names,email, date_of_birth,contact))){
             
      }
    
     String[] selectedItems = request.getParameterValues("selectedItems");
        String fav = " ";
        if (selectedItems != null && selectedItems.length > 0) {
            for (String item : selectedItems) {
                 fav+=item;
                  fav = fav +"  ";
            }
        } else {
            System.out.println("No items selected");
        }
        
    String opt1_0 = request.getParameter("opt1_0");
    String opt1_1 = request.getParameter("opt1_1");
    String opt1_2 = request.getParameter("opt1_2");
    String opt1_3 = request.getParameter("opt1_3");
   // List<Answers> answerList = new ArrayList<>();
    
    // Check if any of the radio button parameters are null or empty
    if ( opt1_0 == null || opt1_0.isEmpty() ||
        opt1_1 == null || opt1_1.isEmpty() || opt1_2 == null || opt1_2.isEmpty() ||
        opt1_3 == null || opt1_3.isEmpty()) {
//            int p1 =  Integer.parseInt(opt1_0);
//            int p2 =  Integer.parseInt(opt1_1);
//            int p3 =  Integer.parseInt(opt1_2);
//            int p4 =  Integer.parseInt(opt1_3);
            
//            Question1 q1 = new Question1("#que1",opt1_0);
//            boolean n = imp.putQuestion1("#que1",p1);
//            System.out.print(n);
//            if(n){
//            
//            }
//            Question2 q2 = new Question2("#que3",opt1_1);
//            Question3 q3 = new Question3("#que4",opt1_2);
//            Question4 q4 = new Question4("#que4",opt1_3);
            
            
        // answerList.add(new Answers(p1,p2,p3,p4));
            
        response.sendRedirect("survey.jsp"); // Add query parameter to indicate error
    } else {
        // Process the form data as needed
        // You can redirect to a success page or perform other actions here
        int p1 =  Integer.parseInt(opt1_0);
            int p2 =  Integer.parseInt(opt1_1);
            int p3 =  Integer.parseInt(opt1_2);
            int p4 =  Integer.parseInt(opt1_3);
          Question1 q1 = new Question1("#que1",opt1_0);
           int x1 = 0, x2 = 0, x3 = 0, x4 = 0;
            x1 = imp.putQuestion1(p1);
           x2 =  imp.putQuestion2(p2);
            x3 = imp.putQuestion3(p3);
           x4 = imp.putQuestion4(p4);
          int  mealId = imp.enterMeal(fav);
          
         boolean answer = imp.survey(email,mealId , x1, x2, x3, x4);
            // get all keys
            if(answer){}
            
           
        response.sendRedirect("success.jsp"); //
    }}

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
