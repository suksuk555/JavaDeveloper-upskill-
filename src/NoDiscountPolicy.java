//Thid class represent a policy with do discount

public class NoDiscountPolicy implements DiscountPolicy{
    @Override
    public double applyDiscount(double amount) {
        if(amount < 0){
            throw new IllegalArgumentException("amount cannot me negitive");
        }
        return amount;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "No Discount";
    }
}
