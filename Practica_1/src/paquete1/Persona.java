package paquete1;

public class Persona {

	private int Edad;
	private String Nombre;
	public Persona(int edad, String nombre) {
		
		super();
				
		this.Edad = Edad;
				
		this.Nombre = Nombre;
			
		}
			
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	@Override
	public String toString() {
		return "Persona [Edad=" + Edad + ", Nombre=" + Nombre + "]";
	}
	

}

