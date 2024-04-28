package za.ac.teamtech.survey.dblistener;


import java.sql.Connection;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import za.ac.teamtech.survey.dblistener.manager.DBManager;
//import za.ac.teamtech.survey.dblistiner.manager.DBManager;


@WebListener
public class DatabaseListener implements ServletContextListener{
  @Override
  public void contextInitialized(ServletContextEvent sce){
    ServletContext sc = sce.getServletContext();
    String url = sc.getInitParameter("url");
    String username = sc.getInitParameter("username");
    String password = sc.getInitParameter("password");
    String driver = sc.getInitParameter("driver");
    String database = sc.getInitParameter("database");
    DBManager dbm = new DBManager(url, database, driver, username, password);
    sc.setAttribute("dbman", dbm);
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce){
    ServletContext sc = sce.getServletContext();
    DBManager dbm = (DBManager) sc.getAttribute("dbman");
    if(dbm != null){
      dbm.closeConnection();
    }
  }
}
