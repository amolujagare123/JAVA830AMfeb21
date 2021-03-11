package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. Loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver"); // package path

       //2.Creating a connection

        String user = "root";
        String password ="root";
        String connectionUrl= "jdbc:mysql://localhost:3306/9pmbatch";

        Connection con = DriverManager.getConnection(connectionUrl,user,password);

        //3.Creating a statement
            Statement st = con.createStatement();

        //4.Executing a query (DML query)

        //String sql = "insert into student values(6,'pooja','IT',81)";

       // String sql = "update student set marks=100 where id=6";

        String sql = "delete from student where id=1";

        st.executeUpdate(sql);



    }
}
