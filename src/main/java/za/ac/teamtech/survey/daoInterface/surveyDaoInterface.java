/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.teamtech.survey.daoInterface;

import java.util.List;

/**
 *
 * @author RONALD
 */
public interface surveyDaoInterface {
    public boolean option(String questionKey , int rate);
    public double avarageMovie();
    public double avarageRadio();
    public double avarageEatOutside();
    public int total();
    public double avarageWatchTV();
    public List<String> question(String Key);
    public int putQuestion1(int rate);
    public int putQuestion2(int rate);
    public int putQuestion3(int rate);
    public int putQuestion4(int rate);
    public int enterRate(int rate);
    public int enterMeal(String meal);
    public double calculateAverageRatingQ1();
    public double calculateAverageRatingQ2();
    public double calculateAverageRatingQ3();
    public double calculateAverageRatingQ4();
    public boolean survey(String email , int meal , int q1 , int q2 , int q3 , int q4);
}
