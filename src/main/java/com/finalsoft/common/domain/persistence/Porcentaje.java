package com.finalsoft.common.domain.persistence;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Porcentaje implements Serializable {

    private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_porcentaje;

    @SuppressWarnings("unused")
	private Integer iva;
    @SuppressWarnings("unused")
	private Integer porcentaje_ingreso;
    @SuppressWarnings("unused")
	private String fecha_inicio;

    @OneToMany(mappedBy = "fk_porcentaje_id_porcentaje", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Score> scores;

}
