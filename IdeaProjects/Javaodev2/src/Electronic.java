public class Electronic extends Product{
    private String brand;
    private String model;


    public Electronic(String name, Double price, Integer stock, String brand, String model){
        super(name,price,stock);
        this.brand=brand;
        this.model=model;
    }
    public String getBrand() { return brand; }
    public String getModel() { return model; }


}
