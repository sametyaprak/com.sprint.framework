package inheritanceMerge;

import java.util.List;

public class Database {
    private String url;
    private String username;
    private String password;
    private List<String> properties;




    public Database() {
    }

    public Database(String url, String username, String password, List<String> properties) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.properties = properties;
    }

    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    @Override
    public String toString() {
        return "Database{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", properties=" + properties +
                '}';
    }
}
