package exercisesixteen;

import java.util.logging.Logger;

public class Person {
    private static final String DEFINED_GENRE = "H";
    Logger logger = Logger.getLogger("logger");

    private String name = "";
    private int age = 0;
    String genre;
    private double weight = 0;
    private double height = 0;

    public Person() {
    }

    public Person(String name, int age, String genre) {
        this.name = name;
        this.age = age;
        this.genre = genre;
    }

    public Person(String name, int age, String genre, double weight, double height) {
        this.name = name;
        this.age = age;
        this.genre = genre;
        this.weight = weight;
        this.height = height;
    }

    public void calculateIMC() {
        double imc = weight/(Math.pow(height,2));
        if (imc < 20){
            logger.info("Bajo de peso");
        }
        if (imc >= 20 && imc <= 25) {
            logger.info("Peso normal");
        }
        if (imc > 25) {
            logger.info("Sobrepeso");
        }
    }

    public void isOfLegalAge(int age) {
        if (age >= 18) {
            logger.info("Es mayor de edad");
        } else {
            logger.info("Es menor de edad");
        }
    }

    public void verifyGender(String gender) {
        if(gender.equals("M")){
            this.genre = DEFINED_GENRE;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + DEFINED_GENRE +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public void generateDNI() {
        double createDNI = 100000000 * Math.random();
        int castDNI = (int) createDNI;
        String stringDNI = "El DNI asignado es: " + castDNI;
        logger.info(stringDNI);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGenre(String genre) {
        verifyGender(genre);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
