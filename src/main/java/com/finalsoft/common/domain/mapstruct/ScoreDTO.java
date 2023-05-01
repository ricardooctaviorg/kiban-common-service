package com.finalsoft.common.domain.mapstruct;


import com.finalsoft.common.domain.persistence.Porcentaje;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ScoreDTO {

    @SuppressWarnings("unused")
	private long idScore;
    @SuppressWarnings("unused")
	private Integer minimo;
    @SuppressWarnings("unused")
	private Integer maximo;
    @SuppressWarnings("unused")
	private Integer porcentaje;
    @SuppressWarnings("unused")
	private Porcentaje fkPorcentaje;

}
