package com.finalsoft.common.domain.persistence;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Score implements Serializable {

    private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_score;

    @SuppressWarnings("unused")
	private Integer maximo;
    @SuppressWarnings("unused")
	private Integer minimo;
    @SuppressWarnings("unused")
	private Integer porcentaje;

    @ManyToOne(fetch = FetchType.LAZY)
    private Porcentaje fk_porcentaje_id_porcentaje;
}
