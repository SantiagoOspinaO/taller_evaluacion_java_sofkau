package exerciseseventeen;

/**
 * The type Television.
 */
public class Television extends Appliance {

    private static final int DEFINED_RESOLUTION = 20;
    private static final boolean DEFINED_TUNER_TDT = false;
    private double resolution;
    private boolean tunerTdt;

    /**
     * Instantiates a new Television.
     */
    public Television() {
    }

    /**
     * Instantiates a new Television.
     *
     * @param weight the weight
     */
    public Television(double weight) {
        super(weight);
    }

    /**
     * Instantiates a new Television.
     *
     * @param color      the color
     * @param energyUse  the energy use
     * @param weight     the weight
     * @param resolution the resolution
     * @param tunerTdt   the tuner tdt
     */
    public Television(String color, char energyUse, double weight, double resolution, boolean tunerTdt) {
        super(color, energyUse, weight);
        this.resolution = resolution;
        this.tunerTdt = tunerTdt;
    }

    @Override
    public double finalPrice() {
        double additionalPrice = super.finalPrice();
        if (resolution > 40) {
            additionalPrice += additionalPrice * 0.3;
        } else if (tunerTdt) {
            additionalPrice += 50;
        }
        return additionalPrice;
    }

    @Override
    public String toString() {
        return "Television{" +
                "resolution=" + resolution +
                ", tunerTdt=" + tunerTdt +
                '}';
    }

    /**
     * Gets resolution.
     *
     * @return the resolution
     */
    public double getResolution() {
        return resolution;
    }

    /**
     * Is tuner tdt boolean.
     *
     * @return the boolean
     */
    public boolean isTunerTdt() {
        return tunerTdt;
    }
}
