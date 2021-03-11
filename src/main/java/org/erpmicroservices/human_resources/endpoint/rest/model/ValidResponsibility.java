package org.erpmicroservices.human_resources.endpoint.rest.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode
public class ValidResponsibility extends AbstractPersistable<UUID> {
 private String comment;
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate fromDate;
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate thruDate;
}
