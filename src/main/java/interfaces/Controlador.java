package interfaces;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public interface Controlador {

	public LocalDateTime ahora();
	
	public void retrocederVista();
	
	public boolean ejecutarCMD(String cmd);
	
	public void notificarMostradores();
	
	public void generarVista(int idl, String arg);
	
	public Item anhadirABandeja(String descripcion);
	
	public Item anhadirABandeja(String descripcion, String info);
	
	
	//G/S
	/*
	Vista vista_actual;
	ConjuntoItems conjunto;
	Configuracion configuracion;
	Persistidor persistidor;
	List<Mostrador> lista_mostradores;
	Map<Integer, GeneradorVista> mapa_generadores;
	Map<String, Comando> mapa_comandos; 
	 */
	
	public Vista getVista_actual();
	public void setVista_actual(Vista vista_actual);

	public ConjuntoItems getConjunto();
	public void setConjunto(ConjuntoItems conjunto);

	public Configuracion getConfiguracion();
	public void setConfiguracion(Configuracion configuracion);
	
	public Persistidor getPersistidor();
	public void setPersistidor(Persistidor persistidor);

	public List<Mostrador> getLista_mostradores();
	public void setLista_mostradores(List<Mostrador> lista_mostradores);
	
	public Map<Integer, GeneradorVista> getMapa_generadores();

	public void setMapa_generadores(Map<Integer, GeneradorVista> mapa_generadores);

	public Map<String, Comando> getMapa_comandos();
	public void setMapa_comandos(Map<String, Comando> mapa_comandos);

}
