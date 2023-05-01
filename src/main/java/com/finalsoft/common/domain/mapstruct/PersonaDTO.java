package com.finalsoft.common.domain.mapstruct;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonaDTO {

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
