package com.finalsoft.common.domain.model;


import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@JsonIgnoreProperties(ignoreUnknown = true)
public class RespuestaBuroScore {

    @SuppressWarnings("unused")
	private Integer idUnykoo;
    @SuppressWarnings("unused")
	private String  status;
    @SuppressWarnings("unused")
	private String  workflooName;
    @SuppressWarnings("unused")
	private String  createdBy;
    @SuppressWarnings("unused")
	private String created;
    @SuppressWarnings("unused")
	private String  modified;

    ArrayList<Object> steps = new ArrayList<Object>();


}
