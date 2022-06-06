package exercisenine;

import java.awt.*;
import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise9 {
     public static void replaceAWithE() {
         Logger logger = Logger.getLogger("logger");
         Scanner in = new Scanner(System.in);
         String text = "La sonrisa sera la mejor arma contra la tristeza";

         logger.info("Ingrese una frase");
         String sentenceInput = in.nextLine();
         String newSentence = text.replace("a", "e");
         String result = newSentence + " " + sentenceInput;
         logger.info(result);
     }

    public static void main(String[] args) {
        replaceAWithE();
    }
}
