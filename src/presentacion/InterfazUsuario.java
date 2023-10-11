package presentacion;

import java.util.ArrayList;

import negocio.*;

public class InterfazUsuario{
	private static String negrita = "\u001B[1m";
	private static String normal = "\033[0m";
	private static String rojo = "\u001B[31m";
	private static String blanco = "\u001B[37m";
	private static void ejecutar(String[] instruccion){
		

		if (instruccion[0].equalsIgnoreCase("mostrar") && instruccion.length == 1 {
			mostrarVUelos(vuelo);
		}else if (instruccion[0].equalsIgnoreCase("añadir") && instruccion.length == 4){
			Vuelo vuelo = new Vuelo(instruccion[1], instruccion[2],instruccion[3]);
			vuelo.annadir(vuelo)
