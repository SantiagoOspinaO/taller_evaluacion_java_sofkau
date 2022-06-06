package exerciseseventeen;

public class Washer extends Appliance {

    private static final int DEFINED_CHARGE = 5;
    private double charge;

    public Washer() {
    }

    public Washer(double weight, double charge) {
        super(weight);
        this.charge = charge;
    }

    public Washer(String color, char energyUse, double weight, double charge) {
        super(color, energyUse, weight);
        this.charge = charge;
    }

    @Override
    public double finalPrice() {
        double additionalPrice = super.finalPrice();
        if (charge > 30) {
            additionalPrice += 50;
        }
        return additionalPrice;
    }

    @Override
    public String toString() {
        return "Washer{" +
                "charge=" + charge +
                '}';
    }

    public double getCharge() {
        return charge;
    }
}
