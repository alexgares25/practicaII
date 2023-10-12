package puntoEntrada;

import presentacion.*;

public class Principal{
	public static void main(String[] args){
//Si escribo `java -cp bin puntoEntrada.Principal añadir 7556 Madrid Valencia 75.0
//entonces
//args[0] es "añadir"
//args[1] es "7556"
//args[2] es "Madrid"
//args[3] es "Valencia
//args [4] es 75.o

		InterfazUsuario.ejecutar(args);
	}
}

