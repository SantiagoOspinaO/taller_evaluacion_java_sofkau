package exerciseseventeen;

/**
 * The type Washer.
 */
public class Washer extends Appliance {

    private static final int DEFINED_CHARGE = 5;
    private double charge;

    /**
     * Instantiates a new Washer.
     */
    public Washer() {
    }

    /**
     * Instantiates a new Washer.
     *
     * @param weight the weight
     * @param charge the charge
     */
    public Washer(double weight, double charge) {
        super(weight);
        this.charge = charge;
    }

    /**
     * Instantiates a new Washer.
     *
     * @param color     the color
     * @param energyUse the energy use
     * @param weight    the weight
     * @param charge    the charge
     */
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

    /**
     * Gets charge.
     *
     * @return the charge
     */
    public double getCharge() {
        return charge;
    }
}
