package MODEL;

public class OrderModel {
    private CustomerModel customer;
    private ProductModel product;
    private int qty;
    private String totalPrice;
    private String date;

    public OrderModel(CustomerModel customer, ProductModel product, int qty, String totalPrice, String date) {
        this.customer = customer;
        this.product = product;
        this.qty = qty;
        this.totalPrice = totalPrice;
        this.date = date;
    }

    public OrderModel() {}

    public String getDate() {
        return date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public CustomerModel getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerModel customer) {
        this.customer = customer;
    }

    public ProductModel getProduct() {
        return product;
    }

    public void setProduct(ProductModel product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    
}
