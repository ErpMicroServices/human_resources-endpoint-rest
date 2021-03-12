package org.erpmicroservices.human_resources.endpoint.rest.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.validator.constraints.Range;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode
public class PositionType extends AbstractPersistable<UUID> {
	private String description;
	@NotBlank
	@NotNull
	private String title;
	@Range(min = 0, max = 100)
	private long benefitPercent;
	@OneToMany
	@JoinColumn(name = "position_type_id")
	private List<ValidResponsibility> validResponsibilities = new ArrayList<>();
	@OneToMany
	@JoinColumn(name = "position_type_id")
	private List<PositionTypeClass> positionTypeClasses = new ArrayList<>();
	private UUID organizationRoleId;
}
