/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.teamtech.survey.daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import za.ac.teamtech.survey.daoInterface.surveyDaoInterface;
import za.ac.teamtech.survey.model.Question1;

/**
 *
 * @author RONALD
 */
public class SurveryDaoImp implements surveyDaoInterface{
    private Connection con = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    
    public SurveryDaoImp(Connection con){
        this.con = con;
    }
    
    
    
    @Override
    public boolean option(String questionKey, int rate) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double avarageMovie() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double avarageRadio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double avarageEatOutside() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double avarageWatchTV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<String> question(String question) {
       List<String> questions = new ArrayList<>();
         try
         {
         pst = con.prepareStatement("SELECT question FROM question WHERE id=?");
         pst.setString(1, question.trim());
         rs = pst.executeQuery();
        
        while (rs.next()){
            questions.add(rs.getString("question"));
        }
         }catch(SQLException sq){
                
            }
        return questions;
    }

    @Override
  public int putQuestion1(int rate) {
  
   int primaryKeyValue = -1; // Default value in case of failure
        try {
            pst = con.prepareStatement("INSERT INTO question1(rate) VALUES (?)",Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, rate);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                ResultSet generatedKeys = pst.getGeneratedKeys();
                if (generatedKeys.next()) {
                    primaryKeyValue = generatedKeys.getInt(1); // Assuming qid is the first column
                    System.out.println("Insert successful! Generated Key: " + primaryKeyValue);
                } else {
                    System.out.println("Insert failed! No generated keys obtained.");
                }
            } else {
                System.out.println("Insert failed! No rows affected.");
            }
        } catch (SQLException sql) {
            System.out.println("SQL Exception: " + sql.getMessage());
            // Handle the exception as needed
        }
        return primaryKeyValue;
}

    @Override
    public int putQuestion2(int rate) {
      
   int primaryKeyValue = -1; // Default value in case of failure
        try {
            pst = con.prepareStatement("INSERT INTO question2(rate) VALUES (?)",Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, rate);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                ResultSet generatedKeys = pst.getGeneratedKeys();
                if (generatedKeys.next()) {
                    primaryKeyValue = generatedKeys.getInt(1); // Assuming qid is the first column
                    System.out.println("Insert successful! Generated Key: " + primaryKeyValue);
                } else {
                    System.out.println("Insert failed! No generated keys obtained.");
                }
            } else {
                System.out.println("Insert failed! No rows affected.");
            }
        } catch (SQLException sql) {
            System.out.println("SQL Exception: " + sql.getMessage());
            // Handle the exception as needed
        }
        return primaryKeyValue;
    }

    @Override
    public int putQuestion3( int rate) {
      
   int primaryKeyValue = -1; // Default value in case of failure
        try {
            pst = con.prepareStatement("INSERT INTO question3(rate) VALUES (?)",Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, rate);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                ResultSet generatedKeys = pst.getGeneratedKeys();
                if (generatedKeys.next()) {
                    primaryKeyValue = generatedKeys.getInt(1); // Assuming qid is the first column
                    System.out.println("Insert successful! Generated Key: " + primaryKeyValue);
                } else {
                    System.out.println("Insert failed! No generated keys obtained.");
                }
            } else {
                System.out.println("Insert failed! No rows affected.");
            }
        } catch (SQLException sql) {
            System.out.println("SQL Exception: " + sql.getMessage());
            // Handle the exception as needed
        }
        return primaryKeyValue;
    }

    @Override
  public int putQuestion4(int rate) {
    int primaryKeyValue = -1; // Default value in case of failure
    try {
        pst = con.prepareStatement("INSERT INTO question4(rate) VALUES (?)", Statement.RETURN_GENERATED_KEYS);
        pst.setInt(1, rate);

        int rowsAffected = pst.executeUpdate();
        if (rowsAffected > 0) {
            ResultSet generatedKeys = pst.getGeneratedKeys();
            if (generatedKeys.next()) {
                primaryKeyValue = generatedKeys.getInt(1); // Assuming qid is the first column
                System.out.println("Insert successful! Generated Key: " + primaryKeyValue);
            } else {
                System.out.println("Insert failed! No generated keys obtained.");
            }
        } else {
            System.out.println("Insert failed! No rows affected.");
        }
    } catch (SQLException sql) {
        System.out.println("SQL Exception: " + sql.getMessage());
        sql.printStackTrace(); // Print stack trace for detailed error information
        // Handle the exception as needed
    }
    return primaryKeyValue;
}

    @Override
    public int enterRate(int rate) {
   
   int primaryKeyValue = -1; // Default value in case of failure
        try {
            pst = con.prepareStatement("INSERT INTO question1(rate) VALUES (?)",Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, rate);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                ResultSet generatedKeys = pst.getGeneratedKeys();
                if (generatedKeys.next()) {
                    primaryKeyValue = generatedKeys.getInt(1); // Assuming qid is the first column
                    System.out.println("Insert successful! Generated Key: " + primaryKeyValue);
                } else {
                    System.out.println("Insert failed! No generated keys obtained.");
                }
            } else {
                System.out.println("Insert failed! No rows affected.");
            }
        } catch (SQLException sql) {
            System.out.println("SQL Exception: " + sql.getMessage());
            // Handle the exception as needed
        }
        return primaryKeyValue;
}

    @Override
    public int enterMeal(String string) {
       
   int primaryKeyValue = -1; // Default value in case of failure
        try {
            pst = con.prepareStatement("INSERT INTO favorite_food(favorite_meal) VALUES (?)",Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, string);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                ResultSet generatedKeys = pst.getGeneratedKeys();
                if (generatedKeys.next()) {
                    primaryKeyValue = generatedKeys.getInt(1); // Assuming qid is the first column
                    System.out.println("Insert successful! Generated Key: " + primaryKeyValue);
                } else {
                    System.out.println("Insert failed! No generated keys obtained.");
                }
            } else {
                System.out.println("Insert failed! No rows affected.");
            }
        } catch (SQLException sql) {
            System.out.println("SQL Exception: " + sql.getMessage());
            // Handle the exception as needed
        }
        return primaryKeyValue;
    }
    

    @Override
   public boolean survey(String email, int meal, int q1, int q2, int q3, int q4) {
        boolean success = false;
        try {
            // Assuming survey_table has columns: id (auto-increment), email (foreign key), meal_id (foreign key),
            // q1_id (foreign key), q2_id (foreign key), q3_id (foreign key), q4_id (foreign key)
           pst = con.prepareStatement(
                "INSERT INTO survey(email, meal, question1, question2, question3, question4) VALUES (?, ?, ?, ?, ?, ?)"
            );
            pst.setString(1, email);
            pst.setInt(2, meal);
            pst.setInt(3, q1);
            pst.setInt(4, q2);
            pst.setInt(5, q3);
            pst.setInt(6, q4);

            int rowsAffected = pst.executeUpdate();
            success = rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exception
        }
        return success;
    }

    @Override
    public int total() {
       int rowCount = 0;
        try {
            pst = con.prepareStatement("SELECT COUNT(*) AS row_count FROM survey");
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
    public double calculateAverageRatingQ1() {
        double averageRating = 0.0;
    try {
        pst = con.prepareStatement("SELECT AVG(rate) AS avg_rating FROM question1");
        ResultSet resultSet = pst.executeQuery();

        if (resultSet.next()) {
            averageRating = resultSet.getDouble("avg_rating");
            averageRating = Math.round(averageRating * 10.0) / 10.0; 
            System.out.println("Average Rating: " + averageRating);
        } else {
            System.out.println("No ratings found.");
        }
    } catch (SQLException sql) {
        System.out.println("SQL Exception: " + sql.getMessage());
        sql.printStackTrace();
        // Handle the exception as needed
    }
    return averageRating;

        
    }
    @Override
    public double calculateAverageRatingQ2() {
          double averageRating = 0.0;
    try {
        pst = con.prepareStatement("SELECT AVG(rate) AS avg_rating FROM question2");
        ResultSet resultSet = pst.executeQuery();

        if (resultSet.next()) {
            averageRating = resultSet.getDouble("avg_rating");
            averageRating = Math.round(averageRating * 10.0) / 10.0; 
            System.out.println("Average Rating: " + averageRating);
        } else {
            System.out.println("No ratings found.");
        }
    } catch (SQLException sql) {
        System.out.println("SQL Exception: " + sql.getMessage());
        sql.printStackTrace();
        // Handle the exception as needed
    }
    return averageRating;

        
    }

    @Override
    public double calculateAverageRatingQ3() {
        double averageRating = 0.0;
    try {
        pst = con.prepareStatement("SELECT AVG(rate) AS avg_rating FROM question3");
        ResultSet resultSet = pst.executeQuery();

        if (resultSet.next()) {
            averageRating = resultSet.getDouble("avg_rating");
            averageRating = Math.round(averageRating * 10.0) / 10.0; 
            System.out.println("Average Rating: " + averageRating);
        } else {
            System.out.println("No ratings found.");
        }
    } catch (SQLException sql) {
        System.out.println("SQL Exception: " + sql.getMessage());
        sql.printStackTrace();
        // Handle the exception as needed
    }
    return averageRating;

    }

    @Override
    public double calculateAverageRatingQ4() {
       double averageRating = 0.0;
    try {
        pst = con.prepareStatement("SELECT AVG(rate) AS avg_rating FROM question4");
        ResultSet resultSet = pst.executeQuery();

        if (resultSet.next()) {
            averageRating = resultSet.getDouble("avg_rating");
            averageRating = Math.round(averageRating * 10.0) / 10.0; 
            System.out.println("Average Rating: " + averageRating);
        } else {
            System.out.println("No ratings found.");
        }
    } catch (SQLException sql) {
        System.out.println("SQL Exception: " + sql.getMessage());
        sql.printStackTrace();
        // Handle the exception as needed
    }
    return averageRating;
 
    }

}
