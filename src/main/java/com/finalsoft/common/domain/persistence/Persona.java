package com.finalsoft.common.domain.persistence;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Persona implements Serializable {
    
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPersona;

	@SuppressWarnings("unused")
	private String codigo_postal;
    @SuppressWarnings("unused")
	private String apellido_paterno;
    @SuppressWarnings("unused")
	private String direccion;
    @SuppressWarnings("unused")
	private String bc_pf_caso_ficticio;
    @SuppressWarnings("unused")
	private String bc_cc_importe;
    @SuppressWarnings("unused")
	private String rfc;
    @SuppressWarnings("unused")
	private String primer_nombre;
    @SuppressWarnings("unused")
	private String apellido_materno;
    @SuppressWarnings("unused")
	private String segundo_nombre;
    @SuppressWarnings("unused")
	private String telefono_celular;
    @SuppressWarnings("unused")
	private String email;
    @SuppressWarnings("unused")
	private Integer edad;


}
