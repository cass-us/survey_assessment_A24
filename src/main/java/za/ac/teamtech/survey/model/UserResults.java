/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.teamtech.survey.model;

/**
 *
 * @author RONALD
 */
public class UserResults {
    // person
    private double total;
    private double avAge;
    private double youngPersonAge;
    private double oldestPersonAge;
   //  meal 
    private double pizzaAve;
    private double pastaAve;
    private double papAve;
    
    // survey
    
    private double q1;
    private double q2;
    private double q3; 
    private double q4;

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the avAge
     */
    public double getAvAge() {
        return avAge;
    }

    /**
     * @param avAge the avAge to set
     */
    public void setAvAge(double avAge) {
        this.avAge = avAge;
    }

    /**
     * @return the youngPersonAge
     */
    public double getYoungPersonAge() {
        return youngPersonAge;
    }

    /**
     * @param youngPersonAge the youngPersonAge to set
     */
    public void setYoungPersonAge(double youngPersonAge) {
        this.youngPersonAge = youngPersonAge;
    }

    /**
     * @return the oldestPersonAge
     */
    public double getOldestPersonAge() {
        return oldestPersonAge;
    }

    /**
     * @param oldestPersonAge the oldestPersonAge to set
     */
    public void setOldestPersonAge(double oldestPersonAge) {
        this.oldestPersonAge = oldestPersonAge;
    }

    /**
     * @return the pizzaAve
     */
    public double getPizzaAve() {
        return pizzaAve;
    }

    /**
     * @param pizzaAve the pizzaAve to set
     */
    public void setPizzaAve(double pizzaAve) {
        this.pizzaAve = pizzaAve;
    }

    /**
     * @return the pastaAve
     */
    public double getPastaAve() {
        return pastaAve;
    }

    /**
     * @param pastaAve the pastaAve to set
     */
    public void setPastaAve(double pastaAve) {
        this.pastaAve = pastaAve;
    }

    /**
     * @return the papAve
     */
    public double getPapAve() {
        return papAve;
    }

    /**
     * @param papAve the papAve to set
     */
    public void setPapAve(double papAve) {
        this.papAve = papAve;
    }

    /**
     * @return the q1
     */
    public double getQ1() {
        return q1;
    }

    /**
     * @param q1 the q1 to set
     */
    public void setQ1(double q1) {
        this.q1 = q1;
    }

    /**
     * @return the q2
     */
    public double getQ2() {
        return q2;
    }

    /**
     * @param q2 the q2 to set
     */
    public void setQ2(double q2) {
        this.q2 = q2;
    }

    /**
     * @return the q3
     */
    public double getQ3() {
        return q3;
    }

    /**
     * @param q3 the q3 to set
     */
    public void setQ3(double q3) {
        this.q3 = q3;
    }

    /**
     * @return the q4
     */
    public double getQ4() {
        return q4;
    }

    /**
     * @param q4 the q4 to set
     */
    public void setQ4(double q4) {
        this.q4 = q4;
    }

    public UserResults(double total, double avAge, double youngPersonAge, double oldestPersonAge, double pizzaAve, double pastaAve, double papAve, double q1, double q2, double q3, double q4) {
        this.total = total;
        this.avAge = avAge;
        this.youngPersonAge = youngPersonAge;
        this.oldestPersonAge = oldestPersonAge;
        this.pizzaAve = pizzaAve;
        this.pastaAve = pastaAve;
        this.papAve = papAve;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
    }
      
   
}
