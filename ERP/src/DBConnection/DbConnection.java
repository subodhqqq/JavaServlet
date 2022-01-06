package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Subodh on 05/01/2022.
 */
public class DbConnection {
    Connection connection=null;
    try
    {
        Class.forName("com.mysql.jdbc.drive");
        String url="jdbc:mysql://localhost:3306/ERP";
        String username="";
        String password="";
        this.connection= DriverManager.getConnection(url,username,password);
        System.out.println("Database connected !!!!!!!");
    }catch(SQLException || ClassNotFoundException e){
        e.printStackTrace();


    }
}
