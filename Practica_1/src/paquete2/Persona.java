package paquete2;

public class Persona {

	private int Edad;
	private String Nombre;
	private String Genero;
	public Persona(int edad, String nombre, String genero) {
		
		super();
				
		this.Edad = Edad;
				
		this.Nombre = Nombre;
				
		this.Genero = Genero;
			
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
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	@Override
	public String toString() {
		return "Persona [Edad=" + Edad + ", Nombre=" + Nombre + ", Genero=" + Genero + "]";
	}
	
}
