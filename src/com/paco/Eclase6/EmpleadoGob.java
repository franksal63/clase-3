package Eclase6;

public class EmpleadoGob extends Empleado {
	
	public EmpleadoGob(int aBono) {
		super(aBonos);
		
	}

@Override
public int cobrarBono() {
	System.out.println("Como emplado de gobierno mi bono es:  " + getBono());
	return getBono();
	
}
}
