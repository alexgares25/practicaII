package mates;
import java.util.Random;

/**
 * Clase Matematicas que contiene métodos relacionados con operaciones matemáticas,
 * incluyendo la generación de una aproximación al número Pi mediante el método de Montecarlo.
 */
public class Matematicas {

    /**
     * Genera una aproximación al número Pi mediante el método de Montecarlo de forma recursiva.
     * El parámetro `pasos` indica el número de puntos generados.
     *
     * @param pasos El número de puntos generados para la estimación de Pi.
     * @return Una aproximación al número Pi basada en el método de Montecarlo.
     */
    public static double generarNumeroPiRecursivo(long pasos) {
        return generarNumeroPiRecursivo(pasos, 0, 0);
    }

    private static double generarNumeroPiRecursivo(long pasos, long dentroCirculo, long totalPuntos) {
        if (pasos == 0) {
            return 4.0 * dentroCirculo / totalPuntos;
        }

        Random random = new Random();
        double x = random.nextDouble();
        double y = random.nextDouble();
        double distancia = Math.sqrt(x * x + y * y);

        if (distancia <= 1) {
            dentroCirculo++;
        }

        return generarNumeroPiRecursivo(pasos - 1, dentroCirculo, totalPuntos + 1);
    }
}
