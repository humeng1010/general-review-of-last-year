package d3_pojo;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.sql.Connection;

public class ConnectionUtils {
    public static Connection connection(){
        Connection connection = null;
        try(
                DruidDataSource druidDataSource = new DruidDataSource();
                ){
            druidDataSource.setUrl("jdbc:mysql://localhost:3307/db1");
            druidDataSource.setUsername("root");
            druidDataSource.setPassword("12345678");
            connection = druidDataSource.getConnection();
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
