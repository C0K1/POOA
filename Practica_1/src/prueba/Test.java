package prueba;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		paquete1.Persona p=new paquete1.Persona(23,"Maria");
		paquete2.Persona m=new paquete2.Persona(24,"Pedro","Masculino");
		paquete1.Persona n=new paquete1.Persona(26,"Juan");
		System.out.println(p.toString());
		System.out.println(m.toString());
		System.out.println(n.toString());
		System.out.println("prueba branch");
	}

}
