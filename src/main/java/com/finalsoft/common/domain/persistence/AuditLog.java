package com.finalsoft.common.domain.persistence;

import java.time.LocalDateTime;

import org.springframework.http.HttpMethod;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "AUDIT_LOG")
@Getter
@Setter
public class AuditLog {

    @Id
    private String id;

    @SuppressWarnings("unused")
	private String request;

    @SuppressWarnings("unused")
	private String response;

    //@Enumerated(EnumType.ORDINAL)
    private HttpMethod methodType;

    @SuppressWarnings("unused")
	private String success;

    @Column(name = "CURR_TIMESTAMP")
    private LocalDateTime timestamp;

    public AuditLog() {

    }
}
