package com.finalsoft.common.domain.mapstruct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpMethod;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class AuditDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("request")
    private String request;

    @JsonProperty("response")
    private String response;

    @JsonProperty("methodType")
    private HttpMethod methodType;

    @JsonProperty("success")
    private String success;

    @JsonProperty("timestamp")
    private LocalDateTime timestamp;

}
