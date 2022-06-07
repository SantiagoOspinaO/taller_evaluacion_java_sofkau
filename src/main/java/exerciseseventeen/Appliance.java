package exerciseseventeen;

import java.util.Objects;

/**
 * Se crea la clase Appliance con el objetivo de modelar un electrodomestico. Además de implementar diferentes metodos.
 *
 * @version 1.00.000 2022-06-05
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-06-05
 */
public class Appliance {
    private static final String DEFINED_COLOR = "Blanco";
    private static final char DEFINED_ENERGY_USE = 'F';
    private static final double DEFINED_BASIC_PRICE = 100;
    private static final double DEFINED_WEIGTH = 5;

    private double basicPrice;
    private String color;
    private char energyUse;
    private double weight;

    /**
     * Instantiates a new Appliance.
     */
    public Appliance() {
    }

    /**
     * Instantiates a new Appliance.
     *
     * @param weight the weight
     */
    public Appliance(double weight) {
        this.basicPrice = DEFINED_BASIC_PRICE;
        this.weight = weight;
    }

    /**
     * Instantiates a new Appliance.
     *
     * @param color     the color
     * @param energyUse the energy use
     * @param weight    the weight
     */
    public Appliance(String color, char energyUse, double weight) {
        this.basicPrice = DEFINED_BASIC_PRICE;
        this.color = color;
        this.energyUse = energyUse;
        this.weight = weight;
    }

    /**
     * Se crea el metodo Check energy use con el objetivo de comprobar el energy use.
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-06-05
     */
    public void checkEnergyUse() {
        char[] charEnergyUse = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (char letter : charEnergyUse) {
            if (letter == energyUse) {
                this.energyUse = letter;
            } else {
                this.energyUse = DEFINED_ENERGY_USE;
            }
        }
    }

    /**
     * Se crea el metodo Check color con el objetivo de comprobar el color.
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-06-05
     */
    public void checkColor() {
        String[] colors = {"blanco", "negro", "rojo", "azul", "gris"};
        for (String couleur : colors) {
            if (Objects.equals(couleur, color)) {
                this.color = couleur;
            } else {
                this.color = DEFINED_COLOR;
            }
        }
    }

    /**
     * Se crea el metodo Final price con el objetivo de calcular el precio final.
     *
     * @return the double
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-06-05
     */
    public double finalPrice() {
        double calculatePriceFinal = 0;

        if (energyUse == 'A') {
            calculatePriceFinal += 100;
        }
        if (energyUse == 'B') {
            calculatePriceFinal += 80;
        }
        if (energyUse == 'C') {
            calculatePriceFinal += 60;
        }
        if (energyUse == 'D') {
            calculatePriceFinal += 50;
        }
        if (energyUse == 'E') {
            calculatePriceFinal += 30;
        }
        if (energyUse == 'F') {
            calculatePriceFinal += 10;
        }
        if (weight > 0 && weight <= 19 ) {
            calculatePriceFinal += 10;
        }
        if (weight > 20 && weight <= 49 ) {
            calculatePriceFinal += 50;
        }
        if (weight > 50 && weight <= 79 ) {
            calculatePriceFinal += 80;
        }
        if (weight > 80) {
            calculatePriceFinal += 100;
        }
        return calculatePriceFinal + DEFINED_BASIC_PRICE;
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "basicPrice=" + basicPrice +
                ", color='" + color + '\'' +
                ", energyUse=" + energyUse +
                ", weight=" + weight +
                '}';
    }

    /**
     * Gets basic price.
     *
     * @return the basic price
     */
    public double getBasicPrice() {
        return basicPrice;
    }

    /**
     * Gets color.
     *
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Gets energy use.
     *
     * @return the energy use
     */
    public char getEnergyUse() {
        return energyUse;
    }

    /**
     * Gets weight.
     *
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }
}

