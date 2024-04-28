/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.teamtech.survey.model;

/**
 *
 * @author RONALD
 */
public class Question5 {
    private String questionKey;
    private int rate;
    private String question;
   public Question5(){}
    public Question5(String questionKey, int rate, String question) {
        this.questionKey = questionKey;
        this.rate = rate;
        this.question = question;
    }

    public Question5(String questionKey, int rate) {
        this.questionKey = questionKey;
        this.rate = rate;
    }
   public Question5(String questionKey, String question) {
        this.questionKey = questionKey;
        this.question = question;
    }

    
    
    /**
     * @return the questionKey
     */
    public String getQuestionKey() {
        return questionKey;
    }

    /**
     * @return the rate
     */
    public int getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(int rate) {
        this.rate = rate;
    }

    /**
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param questionKey the questionKey to set
     */
    public void setQuestionKey(String questionKey) {
        this.questionKey = questionKey;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }
    
    
}
