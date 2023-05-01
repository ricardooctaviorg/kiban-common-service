package com.finalsoft.common.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.finalsoft.common.domain.mapstruct.AuditDto;
import com.finalsoft.common.domain.mapstruct.AuthorDto;
import com.finalsoft.common.domain.mapstruct.BookDto;
import com.finalsoft.common.domain.mapstruct.PersonaDTO;
import com.finalsoft.common.domain.mapstruct.PorcentajeDTO;
import com.finalsoft.common.domain.mapstruct.ScoreDTO;
import com.finalsoft.common.domain.persistence.AuditLog;
import com.finalsoft.common.domain.persistence.Author;
import com.finalsoft.common.domain.persistence.Book;
import com.finalsoft.common.domain.persistence.Persona;
import com.finalsoft.common.domain.persistence.Porcentaje;
import com.finalsoft.common.domain.persistence.Score;

@Mapper(componentModel = "spring")
public interface LibraryMapper {
    BookDto bookToBookDto(Book book);

    List<BookDto> bookToBookDto(List<Book> book);

    AuthorDto authorToAuthorDto(Author author);

    Book bookDtoToBook(BookDto bookDto);

    Author authorDtoToAuthor(AuthorDto authorDto);

    Persona PersonaDtoToPersona(PersonaDTO personaDto);

    Porcentaje PorcentajeDtoToPorcentaje(PorcentajeDTO porcentajeDto);

    Score ScoreDtoToScore(ScoreDTO score, Porcentaje porcentaje);

    AuditLog auditDtoToAuditLog(AuditDto auditDto);

    AuditDto auditLogToAuditDto(AuditLog auditLog);
}
