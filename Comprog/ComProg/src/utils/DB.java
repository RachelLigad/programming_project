package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

    private static Connection con;

    public static Connection getConnection() throws SQLException {

        if (con != null && !con.isClosed()) {
            return con;
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_profile","root","");
                return con;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Can't Connect To Server");
        return null;
    }

    public static ResultSet query(String query, boolean isUpdate) throws SQLException {
        Statement stmnt = getConnection().createStatement();
        System.out.println("Executing query: " + query);
        if (isUpdate) {
            stmnt.executeUpdate(query);
        } else {
            return stmnt.executeQuery(query);
        }

        stmnt.close();
        close();

        return null;
    }

    public static ResultSet query(String query) throws SQLException {
        return query(query, false);
    }

    public static void close() throws SQLException {
        if (con != null && !con.isClosed()) {
            con.close();
        }
    }

}
