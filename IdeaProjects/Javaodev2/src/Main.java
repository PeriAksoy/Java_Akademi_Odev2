//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        //Urunleri olusturuyorum

        //Electronic
        Electronic e1 = new Electronic("Laptop", 19999.99, 10, "Dell", "Inspiron 15");
        Electronic e2 = new Electronic("Akıllı Telefon", 14999.50, 25, "Samsung", "Galaxy S22");
        Electronic e3 = new Electronic("Tablet", 7999.00, 5, "Apple", "iPad Air");
        //Book
        Book b1 = new Book("1984", 59.90, 30, "George Orwell");
        Book b2 = new Book("Suç ve Ceza", 79.50, 15, "Fyodor Dostoyevski");
        Book b3 = new Book("Kürk Mantolu Madonna", 42.00, 40, "Sabahattin Ali");
        //Clothing
        Clothing c1 = new Clothing("Tişört", 129.99, 50, "M", "Beyaz");
        Clothing c2 = new Clothing("Kot Pantolon", 299.90, 20, "L", "Lacivert");
        Clothing c3 = new Clothing("Mont", 699.00, 10, "XL", "Siyah");

        //Urunleri urun listesine ekliyorum
        products.add(e1);
        products.add(e2);
        products.add(e3);
        products.add(b1);
        products.add(b2);
        products.add(b3);
        products.add(c1);
        products.add(c2);
        products.add(c3);

        //Kullanıcı oluşturuyorum
        Scanner scanner = new Scanner(System.in);

        System.out.print("Müşteri adını girin: ");
        String name = scanner.nextLine();

        System.out.print("Müşteri adresini girin: ");
        String adress = scanner.nextLine();

        Customer customer1= new Customer(name, adress);

        //Kullanıcı ürün alım(birden fazla alabilir)

        boolean devam = true;
        do{
            System.out.println(e1.name+"\t"+e1.price+"\t"+e1.stock+"\t"+e1.getBrand()+"\t"+e1.getModel());
            System.out.println(e2.name+"\t"+e2.price+"\t"+e2.stock+"\t"+e2.getBrand()+"\t"+e2.getModel());
            System.out.println(e3.name+"\t"+e3.price+"\t"+e3.stock+"\t"+e3.getBrand()+"\t"+e3.getModel());

            System.out.println(b1.name+"\t"+b1.price+"\t"+b1.stock+"\t"+b1.getAuthor());
            System.out.println(b2.name+"\t"+b2.price+"\t"+b2.stock+"\t"+b2.getAuthor());
            System.out.println(b3.name+"\t"+b3.price+"\t"+b3.stock+"\t"+b3.getAuthor());

            System.out.println(c1.name+"\t"+c1.price+"\t"+c1.stock+"\t"+c1.getSize()+"\t"+c1.getColor());
            System.out.println(c2.name+"\t"+c2.price+"\t"+c2.stock+"\t"+c2.getSize()+"\t"+c2.getColor());
            System.out.println(c3.name+"\t"+c3.price+"\t"+c3.stock+"\t"+c3.getSize()+"\t"+c3.getColor());


            System.out.println("Almak istediğiniz ürün ismini giriniz:");
            String product_name = scanner.nextLine();


            //Urun arama
            boolean control = false;
            for (Product p : products){
                if(p.name.equals(product_name)){
                    control=true;
                    System.out.println("Kaç tane alacağınızı giriniz:");
                    Integer quantity = scanner.nextInt();

                    System.out.println("Seçilen ürün: " + p.getName() + " - Fiyat: " + p.getPrice() + " TL");
                    if(p.stock<quantity){
                        System.out.println("Yeterli stok yok.");
                        break;
                    }else{
                        //Stok azaltma işlemi
                        p.stockUpdate(quantity);
                        System.out.println("Satın alma başarılı. Kalan stok: " + p.getStock());
                        scanner.nextLine();
                        //Kargo
                        System.out.println("Hazırlanıyor...");
                        p.shipping(adress);
                    }
                    break;
                }

            }
            if(!control){
                System.out.println("Urun bulunamadi.");
            }
            System.out.println("Alısverise devam etmek istiyor musunuz?");
            boolean devam_Mi = scanner.nextBoolean();
            if(!devam_Mi){
                devam=false;
            }
            scanner.nextLine();
        }while(devam);

        //Urun indirim
        System.out.println("İndirim yapmak istediğiniz ürün ismini girin:");
        String product_name = scanner.nextLine();
        boolean controll = false;
        for (Product p : products){
            if(p.name.equals(product_name)){
                controll=true;
                System.out.println("İndirim miktarını girin:");
                Double discountRate = scanner.nextDouble();
                p.applyDiscount(discountRate);
                System.out.println("Indırım uygulandı.Yeni fiyat:"+p.price);
            }
        }
        if(!controll){
            System.out.println("Urun bulunamadı.");
        }

    }
}