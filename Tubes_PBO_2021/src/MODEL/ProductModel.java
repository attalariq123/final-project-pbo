package MODEL;

public class ProductModel {
    private int id;
    private String nama;
    private int kuantitas;
    private String deskripsi;
    private String kategori;

    public ProductModel(int id, String nama, int kuantitas, String deskripsi, String kategori) {
        this.id = id;
        this.nama = nama;
        this.kuantitas = kuantitas;
        this.deskripsi = deskripsi;
        this.kategori = kategori;
    }
    
    public ProductModel(){};

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

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}
