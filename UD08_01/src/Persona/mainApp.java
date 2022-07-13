package Persona;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona empleado0 = new Persona();
		Persona empleado1 = new Persona("Clara",23,'M');
		Persona empleado2 = new Persona("Test","39971526F",23,'H', 70.5, 1.75);
		
		System.out.println(empleado0.getNombre());
		System.out.println(empleado1.getNombre());
		System.out.println(empleado2.getNombre());
	}

}
