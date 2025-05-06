public class Customer {
    private String customer_name;
    private String customer_adress;

    public Customer(String customer_name,String customer_adress){
        this.customer_name=customer_name;
        this.customer_adress=customer_adress;

    }
    public String getCustomer_name(){return customer_name;}
    public String getCustomer_adress(){return customer_adress;}

}
