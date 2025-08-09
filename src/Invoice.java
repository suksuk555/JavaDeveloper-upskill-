//composition concept
//Relationship with Customer

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;


    public Invoice(int id,Customer customer,double amount){
        if(id < 0){
            throw new IllegalArgumentException("Customer id must be non negitive");
        }

        if(customer == null){
            throw new IllegalArgumentException("Customer cannot be null");

        }
        if(amount < 0){
            throw new IllegalArgumentException("Amouth must be non negitive");

        }

        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getAmount() {
        return amount;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    public void setAmount(double amount) {
        this.amount = amount;
    }

     public void setCustomer(Customer customer) {
        if(customer == null){
            throw new IllegalArgumentException("Customer cannot be null");
        }
        this.customer = customer;
    }
    public int getCustomerId(){return customer.getId();}
    public String getCustomerName(){return customer.getName();}

    //this method as per UML 
    public double getAmountAfterDiscount(){
        return this.customer.geDiscountPolicy().applyDiscount(this.amount);
    }

    @Override
    public String toString() {
        return "Customer {"+
                            "id= "+id+
                            ", customerId= "+getCustomerId() +
                            ", customerName= "+getCustomerName()+
                            ", originalAmouth= "+String.format("%.2f", amount)+
                            ", discountAmouth= "+String.format("%.2f", getAmountAfterDiscount())+
                            "}";
    }
    
}
