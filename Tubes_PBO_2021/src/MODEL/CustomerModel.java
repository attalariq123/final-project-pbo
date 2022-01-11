package MODEL;

public class CustomerModel extends PersonModel {
    private int id;

    public CustomerModel(int id, String nama, String umur, String alamat, String nomorTelp) {
        super(nama, umur, alamat, nomorTelp);
        this.id = id;
    }
    
    public CustomerModel(String nama){
        super(nama);
    }
    
    public CustomerModel(){}
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
