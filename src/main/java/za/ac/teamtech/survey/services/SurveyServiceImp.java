
package za.ac.teamtech.survey.services;

import java.util.List;
import za.ac.teamtech.survey.daoImp.SurveryDaoImp;
import za.ac.teamtech.survey.serviceInterface.SurveyServiceInterface;


public class SurveyServiceImp implements SurveyServiceInterface{
    private SurveryDaoImp dao;
    
    public SurveyServiceImp(SurveryDaoImp dao){
       this.dao = dao;
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
    public List<String> question(String Key) {
       return dao == null ? null : dao.question(Key);
    }

    @Override
    public int putQuestion1( int i) {
        return dao==null?null: dao.putQuestion1(i);
    }
    @Override
    public int putQuestion2( int i) {
      return dao==null?null: dao.putQuestion2(i);
    }

    @Override
    public int putQuestion3(int i) {
      return dao==null?null: dao.putQuestion3(i);     
    }

    @Override
    public int putQuestion4(int i) {
      return dao==null?null: dao.putQuestion4(i);    
    }

    @Override
    public int enterRate(int i) {
       return dao==null?null: dao.enterRate(i);
    }

    @Override
    public int enterMeal(String string) {
      return dao==null ? null: dao.enterMeal(string);
    }

    @Override
    public boolean survey(String string, int i, int i1, int i2, int i3, int i4) {
       return dao==null?null : dao.survey(string, i, i1, i2, i3, i4);
    }

    @Override
    public int total() {
      return dao==null?null:dao.total();
    }

    @Override
    public double calculateAverageRatingQ1() {
        return dao==null? null : dao.calculateAverageRatingQ1();
    }

    @Override
    public double calculateAverageRatingQ2() {
       return dao==null?null: dao.calculateAverageRatingQ2();
    }

    @Override
    public double calculateAverageRatingQ3() {
        return dao==null?null:dao.calculateAverageRatingQ3();
    }

    @Override
    public double calculateAverageRatingQ4() {
       return dao==null?null:dao.calculateAverageRatingQ4();
    }
}
