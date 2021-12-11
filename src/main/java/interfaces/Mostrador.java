package interfaces;

public interface Mostrador {

	public void actualizar();
	
	//G/S
	
	public Vista getVista_actual();
	public void setVista_actual(Vista vista_actual);
	
	public Controlador getControlador();
	public void setControlador(Controlador controlador);
	
}
