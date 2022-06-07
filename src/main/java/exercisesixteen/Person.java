package exercisesixteen;

import java.util.logging.Logger;

/**
 * Se crea la clase Person con el objetivo de modelar una persona. Además de implementar diferentes metodos.
 *
 * @version 1.00.000 2022-06-05
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-06-05
 */
public class Person {
    private static final String DEFINED_GENRE = "H";
    /**
     * The Logger.
     */
    Logger logger = Logger.getLogger("logger");
    private String name;
    private int age;
    /**
     * The Genre.
     */
    String genre;
    private double weight;
    private double height;

    /**
     * Instantiates a new Person.
     */
    public Person() {
    }

    /**
     * Instantiates a new Person.
     *
     * @param name  the name
     * @param age   the age
     * @param genre the genre
     */
    public Person(String name, int age, String genre) {
        this.name = name;
        this.age = age;
        this.genre = genre;
    }

    /**
     * Instantiates a new Person.
     *
     * @param name   the name
     * @param age    the age
     * @param genre  the genre
     * @param weight the weight
     * @param height the height
     */
    public Person(String name, int age, String genre, double weight, double height) {
        this.name = name;
        this.age = age;
        this.genre = genre;
        this.weight = weight;
        this.height = height;
    }

    /**
     * Se crea el metodo Calculate IMC con el objetivo de calcular el indice de masa coporal de una persona.
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-06-05
     */
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

    /**
     * Se crea el metodo Is of legal Age con el objetivo de comprobar que es mayor de edad.
     *
     * @param age the age
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-06-05
     */
    public void isOfLegalAge(int age) {
        if (age >= 18) {
            logger.info("Es mayor de edad");
        } else {
            logger.info("Es menor de edad");
        }
    }

    /**
     * Se crea el metodo Verify Gender con el objetivo de verificar el genero, que siempre va a ser H.
     *
     * @param gender the gender
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-06-05
     */
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

    /**
     * Se crea el metodo Generate DNI con el objetivo de generar un DNI aleatorio de 8 digitos.
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-06-05
     */
    public void generateDNI() {
        double createDNI = 100000000 * Math.random();
        int castDNI = (int) createDNI;
        String stringDNI = "El DNI asignado es: " + castDNI;
        logger.info(stringDNI);
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets genre.
     *
     * @param genre the genre
     */
    public void setGenre(String genre) {
        verifyGender(genre);
    }

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(double height) {
        this.height = height;
    }
}
