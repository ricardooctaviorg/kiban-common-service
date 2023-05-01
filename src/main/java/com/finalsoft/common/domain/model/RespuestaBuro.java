package com.finalsoft.common.domain.model;

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
public class RespuestaBuro {

    @SuppressWarnings("unused")
	private DataResponse data;
    @SuppressWarnings("unused")
	private boolean success;


}
