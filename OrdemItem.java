public class OrdemItem {
    private Integer quantity; 
    private Double price; 

    private Product product; 

    public OrderItem() {

    }

    public OrdemItem() {
         this.quantity = quantity; 
         this.price = price; 
         this.product = product; 
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity; 
    }

    public void setPrice(Double price) {
        this.price = price; 
    }

    public void setProduct(Product product) {
        this.product = product; 
    }

    public Integer getQuantity() {
        return this.quantity; 
    }

    public Double getPrice() {
        return this.price; 
    }

    public Product getProduct() {
        return this.product; 
    }

    public Double subTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return getProduct().getName()
        + ", $"
        + String.format("%.2f", price)
        + ", Quantidade: "
        + quantity
        + ", Subtotal: $"
        + String.format("%.2f", subTotal()); 
    }
}
