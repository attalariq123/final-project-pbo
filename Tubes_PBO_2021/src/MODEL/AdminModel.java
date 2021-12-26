package MODEL;

public class AdminModel {
    private String username;
    private String password;
    
    public AdminModel(String u, String p) {
        this.username = u;
        this.password = p;
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
    
    public boolean isAdmin(String u, String p) {
        return "admin".equals(u) && "admin".equals(p);
    }
}
