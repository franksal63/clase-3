package Eclase6;

public class aplicacion {
	
	public static void main(String[] args) {
		
		Empleado empleado = new Empleado(aBono:5);
		EmpleadoGob gobEmpleado = new EmpleadoGob(aBono:10_000);
		EmpleadoBbva bbvaEmpleado = new BbvaEmpleado(aBono:15_000);
		EmpleadoPepsi pepsiEmpleado = new PepsiEmpleado(aBono:20_000);
		
		System.out.println(empleado.cobrarBono());
		System.out.println(gobEmpleado.cobrarBono());
		System.out.println(pepsiEmpleado.cobrarBono());
		System.out.println(Bbbvaempleado.cobrarBono());
		
		Empleado poliGovEmp = gob
	}

}
