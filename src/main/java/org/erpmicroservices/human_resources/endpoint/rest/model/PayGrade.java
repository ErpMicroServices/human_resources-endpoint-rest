package org.erpmicroservices.human_resources.endpoint.rest.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode
public class PayGrade extends AbstractPersistable<UUID> {
	@NotBlank
	@NotNull
	private String name;
	private String comment;
	@OneToMany
	@JoinColumn(name = "pay_grade_id")
	private List<SalaryStep> steps;

}
