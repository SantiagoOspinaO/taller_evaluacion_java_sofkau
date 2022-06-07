package exercisesixteen;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Se crea la clase Exercise 16.
 *
 * @version 1.00.000 2022-06-05
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-06-05
 */
public class Exercise16 {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("logger");
        Scanner in = new Scanner(System.in);
        Person person = new Person();

        logger.info("Ingrese el nombre");
        String name = in.nextLine();
        person.setName(name);
        logger.info("Ingrese la edad");
        int age = in.nextInt();
        person.setAge(age);
        logger.info("Ingrese el sexo [H/M]");
        String genre = in.next();
        person.setGenre(genre);
        logger.info("Ingrese el peso");
        double weight = in.nextDouble();
        person.setWeight(weight);
        logger.info("Ingrese la altura");
        double height = in.nextDouble();
        person.setHeight(height);

        Person person1 = new Person(name, age, genre, weight, height);
        logger.info("--> PERSON 1 <--");
        person1.generateDNI();
        person1.calculateIMC();
        person1.isOfLegalAge(age);
        String infoPerson1 = person1.toString();
        logger.info(infoPerson1);

        Person person2 = new Person(name, age, genre);
        person2.setWeight(65);
        person2.setHeight(1.58);
        logger.info("--> PERSON 2 <--");
        person2.generateDNI();
        person2.calculateIMC();
        person2.isOfLegalAge(age);
        String infoPerson2 = person2.toString();
        logger.info(infoPerson2);

        Person person3 = new Person();
        person3.setName("Cristian");
        person3.setAge(25);
        person3.setGenre("M");
        person3.setWeight(70);
        person3.setHeight(1.80);
        logger.info("--> PERSON 3 <--");
        person3.generateDNI();
        person3.calculateIMC();
        person3.isOfLegalAge(age);
        String infoPerson3 = person3.toString();
        logger.info(infoPerson3);
    }
}
