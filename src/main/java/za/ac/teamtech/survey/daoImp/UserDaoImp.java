/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.teamtech.survey.daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import za.ac.teamtech.survey.daoInterface.UserDaoInterface;
import za.ac.teamtech.survey.model.User;

/**
 *
 * @author RONALD
 */
public class UserDaoImp implements UserDaoInterface{
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    
  public UserDaoImp(Connection con){
      this.con = con;
  }
    
    @Override
    public boolean createUser(User user) {
        
       boolean retVal = false;
       
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        int age = 0;
        try {
            // Parse the date string into a Date object
            Date dob = dateFormat.parse(user.getDate_of_birth());

            // Calculate age based on the current date
             age = calculateAge(dob, new Date());
             
              user.setAge(age);
           try{
            pst = con.prepareStatement("INSERT INTO user(full_names,email,date_of_birth,contact,age) VALUES(?,?,?,?,?)");
            pst.setString(1, user.getFull_names());
            pst.setString(2, user.getEmail());
            pst.setString(3, user.getDate_of_birth());
            pst.setString(4, user.getContact());
            pst.setInt(5,user.getAge());
            retVal = pst.executeUpdate()> 0;
        }catch(SQLException sql){
            
        }
            System.out.println("Date of Birth: " + user.getDate_of_birth());
            System.out.println("Age: " + age + " years");

        } catch (ParseException e) {
            System.err.println("Error parsing date: " + e.getMessage());
        }
//        try{
//           pst = con.prepareStatement("INSERT INTO user(full_names,email,date_of_birth,contact) VALUES(?,?,?,?)");
//            pst.setString(1, user.getFull_names());
//            pst.setString(2, user.getEmail());
//            pst.setString(3, user.getDate_of_birth());
//            pst.setString(4, user.getContact());
//            
//            retVal = pst.executeUpdate()> 0;
//        }catch(SQLException sql){
//            
//        }
        return retVal;
    }

    @Override
    public double totalSurveyNum() {
      int rowCount = 0;
        try {
            pst = con.prepareStatement("SELECT COUNT(*) AS row_count FROM user");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                rowCount = rs.getInt("row_count");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exception
        }
        return rowCount; 
    }
    @Override
    public double avarageAge() {
         double averageAge = 0;
        try {
            pst = con.prepareStatement("SELECT AVG(age) AS avg_age FROM user");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                averageAge = rs.getDouble("avg_age");
               
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exception
        }
        return averageAge;
    }

    @Override
    public int oldestPerson() {
        int oldestAge = 0;
    try {
        pst = con.prepareStatement("SELECT MAX(age) AS max_age FROM user");
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            oldestAge = rs.getInt("max_age");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        // Handle exception
    }
    return oldestAge;
    }

    @Override
   public int youngestPerson() {
    int youngest = 0;
    try {
        pst = con.prepareStatement("SELECT MIN(age) AS min_age FROM user");
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            youngest = rs.getInt("min_age");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        // Handle exception
    }
    return youngest;
}
      public static int calculateAge(Date dob, Date currentDate) {
        int age = 0;

        // Calculate age based on the difference in years between two dates
        long diffMillis = currentDate.getTime() - dob.getTime();
        long ageInMillis = diffMillis;
        ageInMillis = ageInMillis / 1000 / 60 / 60 / 24 / 365; // Convert milliseconds to years
        age = (int) ageInMillis;

        return age;
    }
    
}
