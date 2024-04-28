/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.teamtech.survey.services;

import za.ac.teamtech.survey.daoImp.FavFoodDaoImp;
import za.ac.teamtech.survey.serviceInterface.FavFoodServiceInterface;


public class FavFoodService implements FavFoodServiceInterface {
    private FavFoodDaoImp dao; 
   public FavFoodService(FavFoodDaoImp dao){
       this.dao = dao;
   }
    @Override
    public boolean favFood(String favMeal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double pizzaFav() {
        return dao==null? null :  dao.pizzaFav();
    }

    @Override
    public double pastaFav() {
         return dao==null? null :  dao.pastaFav();
    }
    @Override
    public double papWorsFav() {
        return dao==null? null :  dao.papWorsFav();
    }
    
}
