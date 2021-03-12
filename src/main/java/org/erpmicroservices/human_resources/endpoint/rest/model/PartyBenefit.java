package org.erpmicroservices.human_resources.endpoint.rest.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.vladmihalcea.hibernate.type.interval.PostgreSQLIntervalType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.TypeDef;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode
@TypeDef(
		typeClass = PostgreSQLIntervalType.class,
		defaultForType = Duration.class
)
public class PartyBenefit extends AbstractPersistable<UUID> {
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate fromDate;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate thruDate;
	private BigDecimal cost;
	private BigDecimal actualEmployerPaidPercent;
	private Duration availableTime;
	@ManyToOne
	private PartyBenefitType type;
	@ManyToOne
	private PeriodType periodType;
	private UUID employmentPartyRelationshipId;
}
