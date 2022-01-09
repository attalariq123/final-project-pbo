package MODEL;

public class PersonModel {
    private String nama;
    private String umur;
    private String alamat;
    private String nomorTelp;

    public PersonModel(String nama, String umur, String alamat, String nomorTelp) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.nomorTelp = nomorTelp;
    }
    
    public PersonModel(){}

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
}
