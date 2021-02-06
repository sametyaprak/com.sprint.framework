package autoWiring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "database")
    public Database database(){
        Database database = new Database("url","user","123");
        return database;
    }
    @Bean(name = "properties")
    public Properties properties(){
        Properties properties = new Properties("birinci property", "iikinci property");
        return properties;
    }
    @Bean(autowire = Autowire.BY_NAME)
    public DBConnection dbConnection(){
        DBConnection dbConnection = new DBConnection();
        return dbConnection;
    }


}
