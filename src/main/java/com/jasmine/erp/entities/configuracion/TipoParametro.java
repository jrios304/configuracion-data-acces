package com.jasmine.erp.entities.configuracion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.jasmine.erp.configuracion.util.EstadoEnum;

@Entity
@Table(name = "tipo_parametro")
public class TipoParametro {
	
	/**
	 * Identificador del cliente
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 50, nullable = false)
	private String nombre;
	
	@Enumerated(EnumType.STRING)
	@NotNull
	private EstadoEnum estado;
	
	//----------------------------------GETTER Y SETTER--------------------------------------------------------------------
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the estado
	 */
	public EstadoEnum getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(EstadoEnum estado) {
		this.estado = estado;
	} 
}	
