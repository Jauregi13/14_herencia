package Vehiculos;

public class Coche extends Vehiculo {
	
	private String marca;
	
	public Coche(){
		
	}
	
	public Coche(String marca){
		super("coche", 4, false);
		this.marca = marca;
	}
	
	public Coche(boolean enMarcha, String marca){
		super("coche", 4, enMarcha);
		this.marca = marca;
	}
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void mostrarInfo(){
		System.out.println("Tiene "+ super.getRuedas() +" ruedas y es un " + getMarca());
	}
	
	

}
