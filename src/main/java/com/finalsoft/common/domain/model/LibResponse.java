package com.finalsoft.common.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LibResponse {

    @SuppressWarnings("unused")
	private String responseCode;
    @SuppressWarnings("unused")
	private String responseMsg;

    @JsonProperty
    private String idUnykoo;
    @JsonProperty
    private String status_unykoo;
    @JsonProperty
    private String nextStepType;
    @JsonProperty
    private String nextComponentName;


    public LibResponse(String responseCode, String responseMsg) {
        this.responseCode = responseCode;
        this.responseMsg = responseMsg;
    }

    public LibResponse(String idUnykoo, String status_unykoo, String nextStepType, String nextComponentName) {
        this.idUnykoo = idUnykoo;
        this.status_unykoo = status_unykoo;
        this.nextStepType = nextStepType;
        this.nextComponentName = nextComponentName;
    }
}