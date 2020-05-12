/**
 * 
 */
package com.jasmine.erp.configuracion.util;

public enum EstadoEnum {

	ACTIVO("ACTIVO"),
	INACTIVO("INACTIVO");
	
	private String valor;

	private EstadoEnum(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}
}
