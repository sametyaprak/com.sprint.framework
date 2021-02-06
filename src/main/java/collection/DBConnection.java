package collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class DBConnection {

    private String username;
    private String password;

    private List<String> myList;
    private Map<String,String> myMap;
    private Properties props;

    public void openConnection() {
        System.out.println("open connection");
        System.out.println("username: " + username);
        System.out.println("password: " + password );
        System.out.println("mylist data................");
        for(String w:myList) {
            System.out.println("\t - mylist: " + w);
        }
        System.out.println("mymap data................");

        Set<String> keySet = this.myMap.keySet();
        for(String w:keySet) {
            System.out.println("\t - my mapkey: " + myMap.get(w));
        }

        System.out.println("props....................");
        Set<String> myPropsSet = this.props.stringPropertyNames();
        for(String w:myPropsSet) {
            System.out.println("\t - " + w + this.props.getProperty(w));
        }

    }

    public void closeConnection() {
        System.out.println("close connection");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getMyList() {
        return myList;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public Map<String, String> getMyMap() {
        return myMap;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }




}
