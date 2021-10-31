package ru.folder.servlets;


import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.folder.dao.UsersDao;
import ru.folder.dao.UsersDaoImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
//    private Connection connection;
//    @Override
//    public void init() throws ServletException {
//        Properties properties = new Properties();
//        try {
//            properties.load(new FileInputStream(getServletContext().getRealPath("WEB-INF/classes/db.properties")));
//            String dbURL = properties.getProperty("db.url");
//            String dbUserName = properties.getProperty("db.username");
//            String dbPassword = properties.getProperty("db.password");
//            String driverClassName = properties.getProperty("db.driverClassName");
//
//            Class.forName(driverClassName);
//            connection = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
//        } catch (IOException | ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }
//    }
 //   private UsersDao usersDao;

//    @Override
//    public void init() throws ServletException {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        Properties properties = new Properties();
//
//        try {
//            properties.load(new FileInputStream(getServletContext().getRealPath("WEB-INF/classes/db.properties")));
//
//            String dbURL = properties.getProperty("db.url");
//            String dbUserName = properties.getProperty("db.username");
//            String dbPassword = properties.getProperty("db.password");
//            String driverClassName = properties.getProperty("db.driverClassName");
//
//            dataSource.setUsername(dbUserName);
//            dataSource.setPassword(dbPassword);
//            dataSource.setUrl(dbURL);
//            dataSource.setDriverClassName(driverClassName);
//
//           usersDao = new UsersDaoImpl(dataSource);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getServletContext().getRequestDispatcher("/jsp/login.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
