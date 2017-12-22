package Vehiculos;

public class Vehiculo {
	private String tipo;
	private int ruedas;
	private boolean enMarcha;
	
	public Vehiculo(){
		
	}
	
	public Vehiculo(String tipo, int ruedas, boolean enMarcha){
		this.tipo = tipo;
		this.ruedas = ruedas;
		this.enMarcha = enMarcha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public boolean isEnMarcha() {
		return enMarcha;
	}

	public void setEnMarcha(boolean enMarcha) {
		this.enMarcha = enMarcha;
	}
	
	public void mostrarInfo(){
		String enMarcha = "";
		if(isEnMarcha()){
			enMarcha = "está en marcha";
		}
		else{
			enMarcha = "no está en marcha";
		}
		System.out.println("Es un "+getTipo() + ", tiene " + getRuedas() + " ruedas y " + enMarcha);
	}
}
