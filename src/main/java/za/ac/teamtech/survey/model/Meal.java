/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.teamtech.survey.model;

/**
 *
 * @author RONALD
 */
public class Meal {
    
    private int mealId;
    private String mealCode;
    private String meal;

    public Meal() {
    }

    public Meal(int mealId, String mealCode, String meal) {
        this.mealId = mealId;
        this.mealCode = mealCode;
        this.meal = meal;
    }

    public Meal(String mealCode, String meal) {
        this.mealCode = mealCode;
        this.meal = meal;
    }

    public Meal(int mealId, String meal) {
        this.mealId = mealId;
        this.meal = meal;
    }

    
    /**
     * @return the mealId
     */
    public int getMealId() {
        return mealId;
    }

    /**
     * @param mealId the mealId to set
     */
    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    /**
     * @return the mealCode
     */
    public String getMealCode() {
        return mealCode;
    }

    /**
     * @param mealCode the mealCode to set
     */
    public void setMealCode(String mealCode) {
        this.mealCode = mealCode;
    }

    /**
     * @return the meal
     */
    public String getMeal() {
        return meal;
    }

    /**
     * @param meal the meal to set
     */
    public void setMeal(String meal) {
        this.meal = meal;
    }
    
    
}
