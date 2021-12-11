package interfaces;

public interface Configuracion {

	public String get(String propiedad);
	
	public void set(String propiedad, String valor);
	
	public String nombreContexto(int idl);
	
}
