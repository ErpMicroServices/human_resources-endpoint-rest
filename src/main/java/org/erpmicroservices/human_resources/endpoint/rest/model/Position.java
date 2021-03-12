package org.erpmicroservices.human_resources.endpoint.rest.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode
public class Position extends AbstractPersistable<UUID> {
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd")
	@NotNull
	private LocalDate estimatedFromDate = LocalDate.now();
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate estimatedThruDate;
	private boolean salaryFlag;
	private boolean exemptFlag;
	private boolean fullTimeFlag;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd")
	@NotNull
	private LocalDate actualFromDate = LocalDate.now();
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate actualThruDate;
	@NotNull
	@ManyToOne
	private PositionType type;
	@ManyToOne
	private PositionStatusType status;
	@NotNull
	private UUID withinOrganization;
	private UUID budgetItemId;
	@OneToMany
	@JoinColumn(name = "position_id")
	private List<PositionResponsibility> responsibilities = new ArrayList<>();
	@OneToMany
	@JoinColumn(name = "position_id")
	private List<PositionFulfillment> positionFulfillments = new ArrayList<>();
}
