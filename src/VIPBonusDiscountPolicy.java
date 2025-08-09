//This class Applya bese percentage and ...


public class VIPBonusDiscountPolicy implements DiscountPolicy{
    private int basePersent; // ส่วนลดที่ลูกค้าได้รับ
    private int bonusPersent; // ส่วนลดพิเศษ
    private double bonusThreshold; // เงื่อนไขโดยยอดเงินที่จ่ายมากกว่า bonusThreshold


    public VIPBonusDiscountPolicy(int basePersent,int bonusPersent,double bonusThreshold){
        if(basePersent < 0|| basePersent > 100){
            throw new IllegalArgumentException("basePersent must be between 0 and 100");
        }

        this.basePersent = basePersent;
        this.bonusPersent = bonusPersent;
        this.bonusThreshold = bonusThreshold;
    }
    @Override
    public double applyDiscount(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("Amouth cannot be negitive");
        }

        int totalPersent = basePersent;


        if(amount > bonusThreshold){
            totalPersent += bonusPersent;
        }


        //cap the total discount at 100% to prevent negitive prices
        if(totalPersent > 100){
            totalPersent = 100;
        }


        return amount * (1-totalPersent/100.0);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%d base + %d bonus over #.2d",
         basePersent,bonusPersent,bonusThreshold);
}
}
