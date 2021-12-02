package interfaces;

import java.time.LocalDateTime;
import java.time.LocalTime;

public interface Item {

	public boolean mostrable(Controlador c);
	
	public void completar();
	
	//Getters y setters
	/*
	 * protected String descripcion_corta, info_adicional;
	 * protected boolean completada, deadline, resultado_asociado, alerta;
	 * protected LocalDateTime fecha_deadline;
	 * protected LocalTime  inicio_alerta;
	 * protected Item resultado_padre;
	 * protected int lista, id;
	 * 
	 * */

	public String getDescripcion_corta();
	public void setDescripcion_corta(String descripcion_corta);

	public String getInfo_adicional();
	public void setInfo_adicional(String info_adicional);

	public boolean isCompletada();
	public void setCompletada(boolean completada);

	public boolean isDeadline();
	public void setDeadline(boolean deadline);

	public boolean isResultado_asociado();
	public void setResultado_asociado(boolean resultado_asociado);

	public boolean isAlerta();
	public void setAlerta(boolean alerta);
	
	public LocalDateTime getFecha_deadline();
	public void setFecha_deadline(LocalDateTime fecha_deadline);

	public LocalTime getInicio_alerta();
	public void setInicio_alerta(LocalTime inicio_alerta);

	public Item getResultado_padre();
	public void setResultado_padre(Item resultado_padre);

	public int getLista();
	public void setLista(int lista);

	public int getId();
	public void setId(int id);

	
}
