package mates;
import java.util.Random;

/**
 * Clase Matematicas que contiene métodos relacionados con operaciones matemáticas,
 * incluyendo la generación de una aproximación al número Pi mediante el método de Montecarlo.
 */
public class Matematicas {

    /**
     * Genera una aproximación al número Pi mediante el método de Montecarlo.
     * El parámetro `pasos` indica el número de puntos generados.
     *
     * @param pasos El número de puntos generados para la estimación de Pi.
     * @return Una aproximación al número Pi basada en el método de Montecarlo.
     */
    public static double generarNumeroPiIterativo(long pasos) {
        Random random = new Random();
        long dentroCirculo = 0;

        for (long i = 0; i < pasos; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            double distancia = Math.sqrt(x * x + y * y);

            if (distancia <= 1) {
                dentroCirculo++;
            }
        }

        return 4.0 * dentroCirculo / pasos;
    }
}
