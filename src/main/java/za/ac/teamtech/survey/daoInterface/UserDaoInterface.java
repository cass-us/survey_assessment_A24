/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.teamtech.survey.daoInterface;

import za.ac.teamtech.survey.model.User;

/**
 *
 * @author RONALD
 */
public interface UserDaoInterface {
    public boolean createUser(User user);
    public double totalSurveyNum();
    public double avarageAge();
    public int oldestPerson();
    public int youngestPerson();
}
