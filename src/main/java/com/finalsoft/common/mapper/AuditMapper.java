package com.finalsoft.common.mapper;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.finalsoft.common.domain.mapstruct.AuditDto;
import com.finalsoft.common.domain.mapstruct.BookDto;
import com.finalsoft.common.domain.model.LibResponse;
import com.finalsoft.common.util.Constants;

@Component
public class AuditMapper {

    private static final Logger LOG = LoggerFactory.getLogger(AuditMapper.class);

    public AuditDto populateAuditLogForGet(List<BookDto> books) {
        AuditDto log = null;
        log = new AuditDto();
        log.setId(UUID.randomUUID().toString());
        log.setMethodType(HttpMethod.GET);
        log.setRequest(null);
        log.setResponse(String.valueOf(books.size()));
        log.setSuccess(Constants.SUCCESS);
        log.setTimestamp(LocalDateTime.now());
        return log;

    }

    public AuditDto populateAuditLogForGetBook(BookDto book) {
        AuditDto log = null;
        log = new AuditDto();
        log.setId(UUID.randomUUID().toString());
        log.setMethodType(HttpMethod.GET);
        log.setRequest(null);
        log.setResponse(book.toString());
        log.setSuccess(Constants.SUCCESS);
        log.setTimestamp(LocalDateTime.now());
        return log;

    }

    public AuditDto populateAuditLogForPostAndPut(BookDto book, LibResponse response, HttpMethod method) {
        AuditDto log = null;
        try {
            log = new AuditDto();
            log.setId(UUID.randomUUID().toString());
            log.setMethodType(method);
            log.setRequest(new ObjectMapper().writeValueAsString(book));
            log.setResponse(new ObjectMapper().writeValueAsString(response));
            log.setSuccess(Constants.SUCCESS);
            log.setTimestamp(LocalDateTime.now());
        } catch (JsonProcessingException ex) {
            LOG.error("Error processing Object to json", ex);        }
        return log;

    }

    public AuditDto populateAuditLogForDelete(Long id, LibResponse libResponse) {
        AuditDto log = null;
        try {
            log = new AuditDto();
            log.setId(UUID.randomUUID().toString());
            log.setMethodType(HttpMethod.DELETE);
            log.setRequest(String.valueOf(id));
            log.setResponse(new ObjectMapper().writeValueAsString(libResponse));
            log.setSuccess(Constants.SUCCESS);
            log.setTimestamp(LocalDateTime.now());
        } catch (JsonProcessingException ex) {
            LOG.error("Error processing Object to json", ex);
        }
        return log;

    }

    public AuditDto populateAuditLogForException(String request, HttpMethod type, String errorResp) {
        AuditDto log = null;
        try {
            log = new AuditDto();
            log.setId(UUID.randomUUID().toString());
            log.setMethodType(type);
            log.setRequest(request);
            log.setResponse(new ObjectMapper().writeValueAsString(errorResp));
            log.setSuccess(Constants.ERROR);
            log.setTimestamp(LocalDateTime.now());
        } catch (JsonProcessingException ex) {
            LOG.error("Error processing Object to json", ex);
        }
        return log;

    }
}
