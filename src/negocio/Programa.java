package negocio;
import negocio.Vuelo;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Programa{

	private ArrayList<Vuelo> reservavuelo = new ArrayList<>();
	
	public Programa(){
		cargarVuelos();
	}	

	public void annadir(Vuelo vuelo){
		reservavuelo.add(vuelo);
		volcarVuelos();
		
	}


		
	public ArrayList<Vuelo> getreservavuelo(){
		return reservavuelo;
	
	}
	private void volcarVuelos(){
		try{
			FileWriter fw = new FileWriter("vuelos.csv");
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
			fichero.createNewFile();
			Scanner sc = new Scanner(fichero);
			sc.useDelimiter(",|\n");
			while(sc.hasNext()){
				int numeroVuelo = sc.nextInt();
				String origen = sc.next().trim();
				String destino = sc.next().trim();
				float precio = Float.parseFloat(sc.next().trim());
				Vuelo vuelo = new Vuelo(numeroVuelo, origen, destino, precio);
				reservavuelo.add(vuelo);


			}
			sc.close();
		}catch(IOException ex){
			System.err.println("No hay habitantes inscritos");
		}
	
	}

}

