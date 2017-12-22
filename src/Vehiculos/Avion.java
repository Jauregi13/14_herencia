package Vehiculos;

public class Avion extends Vehiculo {
	
	private boolean volando;
	
	
	public Avion(){
		
	}
	
	public Avion(int ruedas){
		super("avion", ruedas, false);
		this.volando = false;
	}


	public boolean isVolando() {
		return volando;
	}


	public void setVolando(boolean volando) {
		this.volando = volando;
	}
	
	
	public void mostrarInfo(){
		System.out.println(super.getTipo() + " está " + this.volando);
	}

}
