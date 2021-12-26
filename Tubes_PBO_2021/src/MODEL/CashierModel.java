package MODEL;

public class CashierModel extends PersonModel {
    private int id;
    private String username, password;

    public CashierModel(int id, String nama, String umur, String alamat, String nomorTelp, String username, String password) {
        super(nama, umur, alamat, nomorTelp);
        this.id = id;
        this.username = username;
        this.password = password;
    }
    
    public CashierModel(){}
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
