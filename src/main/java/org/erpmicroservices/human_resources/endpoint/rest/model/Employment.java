package org.erpmicroservices.human_resources.endpoint.rest.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class Employment extends AbstractPersistable<UUID> {
	@NotNull
	private UUID partyRelationshipId;
	@OneToMany
	@JoinColumn(name = "employment_id")
	@OrderBy(value = "unemploymentClaimDate")
	private List<UnemploymentClaim> unemploymentClaims = new ArrayList<>();
	@ManyToOne
	private TerminationType terminationType;
	@ManyToOne
	private TerminationReason reason;

}
