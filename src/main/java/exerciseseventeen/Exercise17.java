package exerciseseventeen;

import java.util.logging.Logger;

/**
 * Se crea la clase Exercise 17.
 *
 * @version 1.00.000 2022-06-05
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-06-05
 */
public class Exercise17 {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Logger logger = Logger.getLogger("logger");
        Appliance[] applianceList = new Appliance[10];

        applianceList[0] = new Appliance("rojo", 'B', 81);
        applianceList[1] = new Appliance("verde", 'D', 19);
        applianceList[2] = new Appliance("negro", 'A', 50);
        applianceList[3] = new Washer(30, 40);
        applianceList[4] = new Washer(60, 25);
        applianceList[5] = new Washer(80, 60);
        applianceList[6] = new Washer(50, 15);
        applianceList[7] = new Television("naranja", 'H', 37, 46, true);
        applianceList[7].checkEnergyUse();
        applianceList[7].checkColor();
        applianceList[8] = new Television("gris", 'C', 81, 38, false);
        applianceList[9] = new Television("blanco", 'E', 90, 60, true);

        double appliancePriceAdditional = 0;
        double washerPriceAdditional = 0;
        double televisionPriceAdditional = 0;

        for (Appliance appliance : applianceList) {
            if (appliance != null) {
                appliancePriceAdditional += appliance.finalPrice();
            }
            if (appliance instanceof Washer) {
                washerPriceAdditional += appliance.finalPrice();
            }
            if (appliance instanceof Television) {
                televisionPriceAdditional += appliance.finalPrice();
            }
        }
        double priceTotal = appliancePriceAdditional + washerPriceAdditional + televisionPriceAdditional;

        String messageAppliance =  "El precio total de los electrodomesticos es: " + appliancePriceAdditional;
        logger.info(messageAppliance);
        String messageWasher = "El precio total de las lavadoras es: " + washerPriceAdditional;
        logger.info(messageWasher);
        String messageTelevision = "El precio total de los televisores es: " + televisionPriceAdditional;
        logger.info(messageTelevision);
        String messagePriceTotal = "El precio total de todo es: " + priceTotal;
        logger.info(messagePriceTotal);
    }
}
