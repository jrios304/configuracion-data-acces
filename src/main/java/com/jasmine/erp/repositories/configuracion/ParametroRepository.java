package com.jasmine.erp.repositories.configuracion;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jasmine.erp.entities.configuracion.Parametro;

public interface ParametroRepository extends JpaRepository<Parametro, Long>{

	
	@Query("select param from Parametro param inner join TipoParametro tipoParam on param.tipoParametro = tipoParam.id "
			+ "where tipoParam.nombre like ?1 order by param.nombre asc")
	List<Parametro> findByNameTipoParametro(String nombreTipoParametro);
}
