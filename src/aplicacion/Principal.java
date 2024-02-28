package aplicacion;

import mates.Matematicas;

/**
 * Clase Principal que contiene el programa principal para estimar el número pi
 * utilizando el método de Montecarlo.
 */
public class Principal {

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * Acepta un argumento de línea de comandos que representa el número de pasos
     * para la estimación de pi mediante el método de Montecarlo.
     *
     * @param args Argumentos de línea de comandos. Se espera un único argumento: el número de pasos.
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java Principal <numero_de_pasos>");
            System.exit(1);
        }

        long pasos = Long.parseLong(args[0]);

        System.out.println("El número PI es " + Matematicas.generarNumeroPiIterativo(pasos));
    }
}
