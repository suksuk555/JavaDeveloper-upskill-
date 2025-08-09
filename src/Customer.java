//has a relationship with DiscountPolicy






public class Customer {
    private final int id;
    private String name;
    private DiscountPolicy discountPolicy;

    //รหัสลูกต้าไม่ซ้ำกัน

    public Customer(int id, String name , DiscountPolicy discountPolicy){
        if(id < 0){
            throw new IllegalArgumentException("Customer id must be non negitive");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Customer name must not be null or blank.");
        }
        if (discountPolicy==null) {
            throw new IllegalArgumentException("Customer must have a discount policy");
        }

        

        this.id = id;
        this.name = name;
        this.discountPolicy = discountPolicy;

        
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public DiscountPolicy geDiscountPolicy(){return this.discountPolicy;}


    public void setDiscount(DiscountPolicy policy){
        if(policy == null){
            throw new IllegalArgumentException("discount persentage must be between 0 and 100");
        }
        this.discountPolicy = policy;
    }
    @Override
    public String toString() {
        return "Customer {"+
                            "id= "+id+
                            ", name= "+name +
                            ", discountPolicy "+discountPolicy+"}";
    }
}
