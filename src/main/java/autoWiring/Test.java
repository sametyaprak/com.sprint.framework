package autoWiring;

public class Test {

    public static void main(String[] args) {
        Database database = new Database("myQsl","root","1234");
        DBConnection dbConnection = new DBConnection();
        dbConnection.setDatabase(database);
        dbConnection.openConnection();
        dbConnection.closeConnection();

    }
}
