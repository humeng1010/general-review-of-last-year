package d1_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JBDCDemo1 {
    public static void main(String[] args) throws Exception {
//        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/db1?useUnicode=true&characterEncoding=utf8", "root", "12345678");

        Statement statement = connection.createStatement();

        String sql = "select * from tb_user where id = 1;";

        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("username"));
            System.out.println(resultSet.getString("password"));
        }

        statement.close();
        connection.close();
    }
}
