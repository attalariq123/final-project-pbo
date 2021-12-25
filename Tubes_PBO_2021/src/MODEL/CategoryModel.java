package MODEL;

public class CategoryModel {
    private int ID;
    private String nama_kategori;

    public CategoryModel(int ID, String nama_kategori) {
        this.ID = ID;
        this.nama_kategori = nama_kategori;
    }

    public CategoryModel() {}
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNama_kategori() {
        return nama_kategori;
    }

    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }
}
