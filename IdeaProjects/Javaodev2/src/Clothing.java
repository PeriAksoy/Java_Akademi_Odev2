public class Clothing extends Product {

    private String size;
    private String color;


    public Clothing(String name, Double price, Integer stock, String size, String color) {
        super(name, price, stock);
        this.size = size;
        this.color = color;
    }
    public String getSize(){return size;}
    public String getColor(){return color;}

}
