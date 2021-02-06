package collection;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
public class AppConfig {

    @Bean
    public DBConnection dbconnection() {
        DBConnection dbConnection = new DBConnection();
        List<String> mytestList = Arrays.asList("1","2","3");
        Map<String,String> myTestMap = new HashMap<>();
        myTestMap.put("a", "b");
        myTestMap.put("c", "d");
        myTestMap.put("e", "f");
        Properties properties = new Properties();
        properties.setProperty("x", "y");

        dbConnection.setMyList(mytestList);
        dbConnection.setMyMap(myTestMap);
        dbConnection.setProps(properties);
        dbConnection.setUsername("user");
        dbConnection.setPassword("passs");

        dbConnection.openConnection();
        dbConnection.closeConnection();


        return dbConnection;
    }

}




