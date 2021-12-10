/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author attal
 */
public class UserModel {
    private String username;
    private String password;
    
    public UserModel(String u, String p) {
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
