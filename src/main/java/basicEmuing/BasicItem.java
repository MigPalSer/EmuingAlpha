package basicEmuing;

import java.time.LocalDateTime;
import java.time.LocalTime;

import interfaces.Controlador;
import interfaces.Item;

public class BasicItem implements Item {

	private String descripcion_corta, info_adicional;
	private boolean completada, deadline, ventana, resultado_asociado, alerta, esResultado, hibernar;
	private LocalDateTime fecha_deadline, fin_hibernacion;
	private LocalTime inicio_ventana, fin_ventana, inicio_alerta;
	private Item resultado_padre;
	private int lista, id;
	
	public boolean mostrar(Controlador c) {
		if(completada)return false;
		if(ventana) {
			//TODO
		}
		if(hibernar) {
			//TODO
		}
		return true;
	}

	public String descripcionCorta() {
		return descripcion_corta;
	}

	public void completar() {
		completada=true;
		
	}

	
	
	public BasicItem(String descripcion_corta) {
		super();
		this.descripcion_corta = descripcion_corta;
		completada=false;
		deadline=false;
		ventana=false;
		resultado_asociado=false;
		alerta=false;
		esResultado=false; 
		hibernar=false;
	}

	//Getters y setters a continuación
	
	
	public String getDescripcion_corta() {
		return descripcion_corta;
	}

	public void setDescripcion_corta(String descripcion_corta) {
		this.descripcion_corta = descripcion_corta;
	}

	public String getInfo_adicional() {
		return info_adicional;
	}

	public void setInfo_adicional(String info_adicional) {
		this.info_adicional = info_adicional;
	}

	public boolean isCompletada() {
		return completada;
	}

	public void setCompletada(boolean completada) {
		this.completada = completada;
	}

	public boolean isDeadline() {
		return deadline;
	}

	public void setDeadline(boolean deadline) {
		this.deadline = deadline;
	}

	public boolean isVentana() {
		return ventana;
	}

	public void setVentana(boolean ventana) {
		this.ventana = ventana;
	}

	public boolean isResultado_asociado() {
		return resultado_asociado;
	}

	public void setResultado_asociado(boolean resultado_asociado) {
		this.resultado_asociado = resultado_asociado;
	}

	public boolean isAlerta() {
		return alerta;
	}

	public void setAlerta(boolean alerta) {
		this.alerta = alerta;
	}

	public boolean isEsResultado() {
		return esResultado;
	}

	public void setEsResultado(boolean esResultado) {
		this.esResultado = esResultado;
	}

	public boolean isHibernar() {
		return hibernar;
	}

	public void setHibernar(boolean hibernar) {
		this.hibernar = hibernar;
	}

	public LocalDateTime getFecha_deadline() {
		return fecha_deadline;
	}

	public void setFecha_deadline(LocalDateTime fecha_deadline) {
		this.fecha_deadline = fecha_deadline;
	}

	public LocalDateTime getFin_hibernacion() {
		return fin_hibernacion;
	}

	public void setFin_hibernacion(LocalDateTime fin_hibernacion) {
		this.fin_hibernacion = fin_hibernacion;
	}

	public LocalTime getInicio_ventana() {
		return inicio_ventana;
	}

	public void setInicio_ventana(LocalTime inicio_ventana) {
		this.inicio_ventana = inicio_ventana;
	}

	public LocalTime getFin_ventana() {
		return fin_ventana;
	}

	public void setFin_ventana(LocalTime fin_ventana) {
		this.fin_ventana = fin_ventana;
	}

	public LocalTime getInicio_alerta() {
		return inicio_alerta;
	}

	public void setInicio_alerta(LocalTime inicio_alerta) {
		this.inicio_alerta = inicio_alerta;
	}

	public Item getResultado_padre() {
		return resultado_padre;
	}

	public void setResultado_padre(Item resultado_padre) {
		this.resultado_padre = resultado_padre;
	}

	public int getLista() {
		return lista;
	}

	public void setLista(int lista) {
		this.lista = lista;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
}