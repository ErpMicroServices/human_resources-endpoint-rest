package org.erpmicroservices.human_resources.endpoint.rest.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode
public class SalaryStep extends AbstractPersistable<UUID> {
	private BigDecimal amount;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateModified;
	@OneToMany
	@JoinColumn(name = "salary_step_id")
	private List<PositionTypeRate> positionTypeRates = new ArrayList<>();
	@OneToMany
	@JoinColumn(name = "salary_step_id")
	private List<PayHistory> payHistories = new ArrayList<>();

}
