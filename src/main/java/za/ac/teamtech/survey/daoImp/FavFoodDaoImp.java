
package za.ac.teamtech.survey.daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import za.ac.teamtech.survey.daoInterface.favFoodDaoInterface;


public class FavFoodDaoImp implements favFoodDaoInterface {
    private PreparedStatement pst;
    private Connection con;
    
    public  FavFoodDaoImp(Connection con){
        this.con = con;
    }
    @Override
    public boolean favFood(String favMeal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double pizzaFav() {
      double pizzaPercentage = 0.0;
    try {
        // Count the number of respondents who like pizza
        pst = con.prepareStatement("SELECT COUNT(*) AS pizza_count FROM favorite_food WHERE favorite_meal = 'Pizza'");
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            int pizzaCount = rs.getInt("pizza_count");

            // Get the total number of respondents
            pst = con.prepareStatement("SELECT COUNT(*) AS total_count FROM favorite_food");
            ResultSet totalRs = pst.executeQuery();
            if (totalRs.next()) {
                int totalCount = totalRs.getInt("total_count");

                // Calculate the percentage
                if (totalCount > 0) {
                    // pasta = Math.round(((double) pizzaCount / totalCount) * 1000.0) / 10.0;
                    pizzaPercentage = Math.round(((double) pizzaCount / totalCount) * 100.0)/10.0;
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        // Handle exception
    }
    return pizzaPercentage;
    }

    @Override
    public double pastaFav() {
          double pasta = 0.0;
    try {
        // Count the number of respondents who like pizza
        pst = con.prepareStatement("SELECT COUNT(*) AS pasta_count FROM favorite_food WHERE favorite_meal = 'Pasta'");
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            int pizzaCount = rs.getInt("pasta_count");

            // Get the total number of respondents
            pst = con.prepareStatement("SELECT COUNT(*) AS total_count FROM favorite_food");
            ResultSet totalRs = pst.executeQuery();
            if (totalRs.next()) {
                int totalCount = totalRs.getInt("total_count");

                // Calculate the percentage
              //pastaPercentage = Math.round(((double) pizzaCount / totalCount) * 1000.0) / 10.0;
                    pasta = Math.round(((double) pizzaCount / totalCount) * 1000.0) / 10.0;
                
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        // Handle exception
    }
    return pasta;
    }

    @Override
    public double papWorsFav() {
              double papAndWors = 0.0;
    try {
        // Count the number of respondents who like pizza
        pst = con.prepareStatement("SELECT COUNT(*) AS pasta_count FROM favorite_food WHERE favorite_meal = 'Pap and Wors'");
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            int count = rs.getInt("pasta_count");

            // Get the total number of respondents
            pst = con.prepareStatement("SELECT COUNT(*) AS total_count FROM favorite_food");
            ResultSet totalRs = pst.executeQuery();
            if (totalRs.next()) {
                int totalCount = totalRs.getInt("total_count");

                // Calculate the percentage
                if (totalCount > 0) {
                    // pasta = Math.round(((double) pizzaCount / totalCount) * 1000.0) / 10.0;
                    papAndWors = Math.round(((double) count / totalCount) * 100.0)/10.0;
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        // Handle exception
    }
    return papAndWors;
    }
    
}
