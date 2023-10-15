package presentacion;

import java.util.ArrayList;

import negocio.Vuelo;
import negocio.Programa;

public class InterfazUsuario{
	private static String negrita = "\u001B[1m";
	private static String normal = "\033[0m";
	private static String rojo = "\u001B[31m";
	private static String blanco = "\u001B[37m";
	public static void ejecutar(String[] instruccion){
		

		if (instruccion[0].equalsIgnoreCase("mostrar") && instruccion.length == 1) {
			mostrarVuelos();
		}else if (instruccion[0].equalsIgnoreCase("añadir") && instruccion.length == 5){
			int intruccion1 = Integer.parseInt(instruccion[1]);
			float instruccion4 = (float) Double.parseDouble(instruccion[4]);
			Vuelo vuelo = new Vuelo(intruccion1, instruccion[2],instruccion[3], instruccion4);
			Programa programa = new Programa();
			programa.annadir(vuelo);
		}else if (instruccion[0].equalsIgnoreCase("ayuda") && instruccion.length == 1){
			ayuda();
		}else {
			System.out.println(rojo + "El formato utilizado en la entrada es incorrecto " + blanco);
			ayuda();
		}
	}

	private static void mostrarVuelos(){
		Programa programa = new Programa();
		ArrayList<Vuelo> listaVuelos = programa.getreservavuelo();
		for (Vuelo vuelo :listaVuelos){
			System.out.println(vuelo);
		}
	}

	private static void ayuda(){
		System.out.println("\n" + negrita +"DESCRIPCIÓN"+normal);
		System.out.println("\tEsta aplicación ofrece las siguientes funcionalidades : \n\n" +
				"\t- Permite añadir un nuevo vuelo a las reservas\n" +
				"\t- Permite mostrar todos los vuelos que hay en las reservas\n");
		System.out.println(negrita + "FORMATO" + normal);
		System.out.println("\tPara añadir un nuevo habitante,se escribe:\n");
		System.out.println("\t\t"+negrita+"java -cp bin puntoEntrada.Principal añadir <numvuelo> <origen> <destino> <precio>" + normal +"\n");
		System.out.println("\tPara mostrar los vuelos disponibles,se teclea:\n");
		System.out.println("\t\t "+ negrita+ "java -cp bin puntoEntrada.Principal mostrar" + normal + "\n");
		System.out.println("\tPara mostrar esta ayuda, se escribe:\n");
		System.out.println("\t\t"+negrita+"java -cp bin puntoEntrada.Principal ayuda"+normal+"\n");
		System.out.println(negrita +"Ejemplos"+normal);
		System.out.println("\tEjemplo 1\n");
		System.out.println("\t\t"+negrita+"java -cp bin puntoEntrada.Principal añadir 74456 Madrid Valencia 75.5"+normal+"\n");
		System.out.println("\tEjemplo 2\n");
		System.out.println("\t\t" +negrita+"java -cp bin puntoEntrada.Principal mostrar"+normal+"\n");
		System.out.println("\tEjemplo 2\n");
		System.out.println("\t\t"+negrita+"java -cp bin puntoEntrada.Principal ayuda"+ normal +"\n");
	}
}

