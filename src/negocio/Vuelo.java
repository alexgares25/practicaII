package negocio;

public class Vuelo{
	private int numvuelo;
       	private String origen;
	private String destino;
	private float precio;



	public Vuelo(int numvuelo, String origen,String destino,float precio){
	
		this.numvuelo = numvuelo;
		this.origen = origen;
		this.destino = destino;
		this.precio = precio;
	}	


	public int getnumvuelo(){
		return numvuelo;
	}

	public String getorigen(){
		return origen;
	
	}
	public String getdestino(){
		return destino;
	}
	
	public float getprecio(){
		return precio;
	}

	@Override	
	public String toString(){
		return "Numero de vuelo:#"+ getnumvuelo() + " -Origen:" + getorigen() + " -Destino:" + getdestino() + " -Precio:" + getprecio() + "€";
	}




}

