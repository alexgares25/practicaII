package negocio;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Programa{

	private ArrayList<Vuelo> reservavuelo = new ArrayList<>()
	

	public void annadir(Vuelo vuelo){
		reservavuelo.add(vuelo);
		volcarVuelos();
		
	}

	public Programa(){
		cargarvuelos();
	}


		
	public ArrayList<Vuelo> getreservavuelo(){
		return reservavuelo;
	
	}
	private void volcarVuelos(){
		try{
			Filewriter fw = new FileWriter("vuelos.csv);
			for(Vuelo vuelo : reservavuelo){
			  fw.write(vuelo.getnumvuelo() + "," +
					  vuelo.getorigen() + "," +
					  vuelo.getdestino() + "," +
					  vuelo.getprecio() + "\n");
				
			}
			fw.close();

		
		}catch(IOException ex){
			System.err.println(ex);
		}

	
	}

	private void cargarVuelos(){
		try{
			File fichero = new File("vuelos.csv");
			//crea el fichero si no existe
			fichero.createnewfile();
			Scanner sc = new Scanner(fichero);
			sc.useDelimiter(",|\n");
			while(sc.hasnext()){
				Vuelo vuelo = new Vuelo(sc.next(),
						sc.next(),
						sc.next());
				reservavuelo.add(vuelo);


			}
			sc.close();
		}catch(IOException ex){
			System.err.println("No hay habitantes inscritos");
		}
	
	}

}

