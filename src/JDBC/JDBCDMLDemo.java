package JDBC;

import java.sql.*;

public class JDBCDMLDemo {

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

        //4.Executing a query (DDL query)

        String sql = "select * from student";

        ResultSet rs = st.executeQuery(sql);

        /*
        * rs.next()
        * 1. it moves the pointer to the next records
        * 2. it checks whether there is a record next or not
        * based on that it either returns true or false value
        * */

        while(rs.next()) // as long as there are records
        {
            System.out.print(rs.getInt("id")+"\t");
            System.out.print(rs.getString("name")+"\t");
            System.out.print(rs.getString("branch")+"\t");
            System.out.print(rs.getInt("marks"));

            System.out.println();
        }


    }
}
