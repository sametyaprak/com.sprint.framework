package collection;

import java.util.*;

public class Test {

    public static void main(String[] args) {
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
    }

}
