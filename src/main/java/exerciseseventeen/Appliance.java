package exerciseseventeen;

import java.util.Objects;

public class Appliance {

    private static final String DEFINED_COLOR = "Blanco";
    private static final char DEFINED_ENERGY_USE = 'F';
    private static final double DEFINED_BASIC_PRICE = 100;
    private static final double DEFINED_WEIGTH = 5;

    private double basicPrice;
    private String color;
    private char energyUse;
    private double weight;


    public Appliance() {
    }

    public Appliance(double weight) {
        this.basicPrice = DEFINED_BASIC_PRICE;
        this.weight = weight;
    }

    public Appliance(String color, char energyUse, double weight) {
        this.basicPrice = DEFINED_BASIC_PRICE;
        this.color = color;
        this.energyUse = energyUse;
        this.weight = weight;
    }

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

    public double getBasicPrice() {
        return basicPrice;
    }

    public String getColor() {
        return color;
    }

    public char getEnergyUse() {
        return energyUse;
    }

    public double getWeight() {
        return weight;
    }
}

