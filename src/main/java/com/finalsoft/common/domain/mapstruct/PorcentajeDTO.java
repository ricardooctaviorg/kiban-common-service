package com.finalsoft.common.domain.mapstruct;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PorcentajeDTO {

    @SuppressWarnings("unused")
	private long idPorcentaje;
    @SuppressWarnings("unused")
	private Integer iva;
    @SuppressWarnings("unused")
	private Integer porcentajeIngreso;
    @SuppressWarnings("unused")
	private String fechaInicio;
    @SuppressWarnings("unused")
	private List<ScoreDTO> scores;
 }
