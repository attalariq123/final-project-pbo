package MODEL;

public class CashierModel {
    private int id;
    private String nama, umur, alamat, nomorTelp, username, password;

    public CashierModel(int id, String nama, String umur, String alamat, String nomorTelp, String username, String password) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.nomorTelp = nomorTelp;
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

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorTelp() {
        return nomorTelp;
    }

    public void setNomorTelp(String nomorTelp) {
        this.nomorTelp = nomorTelp;
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
