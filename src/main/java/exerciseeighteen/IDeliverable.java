package exerciseeighteen;

/**
 * Se crea la interfaz IDeliverable con el objetivo de que las clases que la implementen utilicen sus metodos.
 *
 * @version 1.00.000 2022-06-05
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-06-05
 */
public interface IDeliverable {
    /**
     * Deliver.
     */
    void deliver();

    /**
     * Send back.
     */
    void sendBack();

    /**
     * Is delivered boolean.
     *
     * @return the boolean
     */
    boolean isDelivered();

    /**
     * Compare to int.
     *
     * @param object the object
     * @return the int
     */
    int compareTo(Object object);
}
