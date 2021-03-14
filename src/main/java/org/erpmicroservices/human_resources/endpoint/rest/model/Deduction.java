package org.erpmicroservices.human_resources.endpoint.rest.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode
public class Deduction extends AbstractPersistable<UUID> {
	@NotNull
	private BigDecimal amount;
	@NotNull
	private UUID paycheckId;
	@NotNull
	@ManyToOne
	private DeductionType type;
}
