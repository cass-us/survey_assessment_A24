/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.teamtech.survey.model;

/**
 *
 * @author RONALD
 */
public class Survey {
    private int surveyId;
    private String email;
    private int foodId;
    private String Key1;
    private String Key2;
    private String Key3;
    private String Key4;
    private int total;
    public Survey() {
    }

    public Survey(int surveyId, String email, int foodId) {
        this.surveyId = surveyId;
        this.email = email;
        this.foodId = foodId;
    }

    public Survey(int surveyId, String Key1, String Key2, String Key3, String Key4) {
        this.surveyId = surveyId;
        this.Key1 = Key1;
        this.Key2 = Key2;
        this.Key3 = Key3;
        this.Key4 = Key4;
    }

    public Survey(int surveyId, String email, int foodId, String Key1, String Key2, String Key3, String Key4) {
        this.surveyId = surveyId;
        this.email = email;
        this.foodId = foodId;
        this.Key1 = Key1;
        this.Key2 = Key2;
        this.Key3 = Key3;
        this.Key4 = Key4;
    }

    public Survey(int surveyId, String email, String Key1, String Key2, String Key3, String Key4) {
        this.surveyId = surveyId;
        this.email = email;
        this.Key1 = Key1;
        this.Key2 = Key2;
        this.Key3 = Key3;
        this.Key4 = Key4;
    }

    
    /**
     * @return the surveyId
     */
    public int getSurveyId() {
        return surveyId;
    }

    /**
     * @param surveyId the surveyId to set
     */
    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the foodId
     */
    public int getFoodId() {
        return foodId;
    }

    /**
     * @param foodId the foodId to set
     */
    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    /**
     * @return the Key1
     */
    public String getKey1() {
        return Key1;
    }

    /**
     * @param Key1 the Key1 to set
     */
    public void setKey1(String Key1) {
        this.Key1 = Key1;
    }

    /**
     * @return the Key2
     */
    public String getKey2() {
        return Key2;
    }

    /**
     * @param Key2 the Key2 to set
     */
    public void setKey2(String Key2) {
        this.Key2 = Key2;
    }

    /**
     * @return the Key3
     */
    public String getKey3() {
        return Key3;
    }

    /**
     * @param Key3 the Key3 to set
     */
    public void setKey3(String Key3) {
        this.Key3 = Key3;
    }

    /**
     * @return the Key4
     */
    public String getKey4() {
        return Key4;
    }

    /**
     * @param Key4 the Key4 to set
     */
    public void setKey4(String Key4) {
        this.Key4 = Key4;
    }
      
     public void setTotal(int total) {
         this.total = total;
     }
   
      public int getTotal(){
          return total;
}
}