package autoWiring;

public class DBConnection {


    private Database database;
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public DBConnection() {
    }

    public DBConnection(Database database, Properties properties) {
        this.database = database;
        this.properties = properties;
    }

    public void openConnection(){
        System.out.println("connection has opened");
        System.out.println(this.database.getUrl());
        System.out.println(this.database.getUsername());
        System.out.println(this.database.getPassword());
        System.out.println("properties bilgileri");
        System.out.println("properties1 "+this.properties.getProperty1());
        System.out.println("properties2 "+this.properties.getProperty2());
    }

    public void closeConnection(){
        System.out.println("connection closed");
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }
}