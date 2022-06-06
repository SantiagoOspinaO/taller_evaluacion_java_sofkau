package exerciseseventeen;

public class Television extends Appliance {

    private static final int DEFINED_RESOLUTION = 20;
    private static final boolean DEFINED_TUNER_TDT = false;
    private double resolution;
    private boolean tunerTdt;

    public Television() {
    }

    public Television(double weight) {
        super(weight);
    }

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

    public double getResolution() {
        return resolution;
    }

    public boolean isTunerTdt() {
        return tunerTdt;
    }
}
