package org.erpmicroservices.human_resources.endpoint.rest.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class RatingType extends AbstractPersistable<UUID> {
	@NotBlank
	@NotNull
	private String description;

	@ManyToOne
	private RatingType parent;

}
