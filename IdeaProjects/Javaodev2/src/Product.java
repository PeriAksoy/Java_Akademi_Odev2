public abstract class Product {
    protected String name;

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    protected Double price;

    public Integer getStock() {
        return stock;
    }

    protected Integer stock;

    public Product(String name,Double price,Integer stock) {
        this.name = name;
        this.price=price;
        this.stock=stock;
    }
    public  void shipping(String adress){
        System.out.println("Urun "+adress+" adresine teslim ediliyor.");
    }

    public void applyDiscount(double discountRate){
        price-=price * discountRate/100;
        System.out.println(name+"için indirim uygulandı.Yeni fiyat:"+price);
    }
    public void stockUpdate(Integer quantity){
        stock-=quantity;
    }

}
