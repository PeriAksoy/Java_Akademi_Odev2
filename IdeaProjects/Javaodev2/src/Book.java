public class Book extends Product{
    private String author;

    public Book (String name, Double price, Integer stock, String author){
        super(name,price,stock);
        this.author=author;
    }

    public String getAuthor(){return author;}



}
