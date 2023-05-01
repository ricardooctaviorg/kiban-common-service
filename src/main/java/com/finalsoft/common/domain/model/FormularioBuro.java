package com.finalsoft.common.domain.model;


import com.finalsoft.common.domain.mapstruct.PersonaDTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FormularioBuro {
    
    @SuppressWarnings("unused")
	private String login;
    @SuppressWarnings("unused")
	private String workflowName;
    @SuppressWarnings("unused")
	private String idUnykoo;
    @SuppressWarnings("unused")
	private String formName;
    @SuppressWarnings("unused")
	private String nip;
    @SuppressWarnings("unused")
	private PersonaDTO data;
    @SuppressWarnings("unused")
	private Double enganche_cliente;
    @SuppressWarnings("unused")
	private Double ingreso_declarado;
    @SuppressWarnings("unused")
	private Double precio_moto;

}
