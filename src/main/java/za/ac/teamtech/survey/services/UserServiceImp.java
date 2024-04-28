/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.teamtech.survey.services;

import java.sql.Connection;
import za.ac.teamtech.survey.daoImp.UserDaoImp;
import za.ac.teamtech.survey.model.User;
import za.ac.teamtech.survey.serviceInterface.UserServiceInterface;

/**
 *
 * @author RONALD
 */
public class UserServiceImp implements UserServiceInterface {
    private UserDaoImp dao;
    public UserServiceImp(UserDaoImp dao){
        this.dao = dao;
    }
    @Override
    public boolean createUser(User user) {
          return dao==null ?  null : dao.createUser(user);
    }

    @Override
    public double totalSurveyNum() {
        return dao== null ? null : dao.totalSurveyNum();
    }

    @Override
    public double avarageAge() {
        return dao== null ? null : dao.avarageAge();
    }
    @Override
    public int oldestPerson() {
         return dao== null ? null : dao.oldestPerson();
    }

    @Override
    public int youngestPerson() {
         return dao== null ? null : dao.youngestPerson();
    }
    
}
