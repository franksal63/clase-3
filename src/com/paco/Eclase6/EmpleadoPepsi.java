package Eclase6;

public class EmpleadoPepsi extends Empleado {
	
	public EmpleadoPepsi(int aBono) {
		super(aBono);
}

	@Override
	public int cobrarBono() {
		System.out.println("Como empleado de gobierno mi bono es:  " + getbono);
		return bono;
	
}
