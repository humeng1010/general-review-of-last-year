package d1_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCDemo2 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/db1?useServerPrepStmts=true", "root", "12345678");

        PreparedStatement preparedStatement = connection.prepareStatement("select count(*) from tb_user where username = ? and password = ?;");

        preparedStatement.setString(1,"张四");
        preparedStatement.setString(2,"123456");

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1));
        }

    }
}
