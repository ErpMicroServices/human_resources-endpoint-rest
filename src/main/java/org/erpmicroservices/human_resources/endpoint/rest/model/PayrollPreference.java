package org.erpmicroservices.human_resources.endpoint.rest.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode
public class PayrollPreference extends AbstractPersistable<UUID> {
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate fromDate;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate thruDate;
	private BigDecimal percentage;
	private BigDecimal flatAmount;
	private String routingNumber;
	private String accountNumber;
	private String bankName;
	@NotNull
	@ManyToOne
	private DeductionType deductionType;
	@NotNull
	private UUID employeeRoleId;
	@NotNull
	private UUID internalOrganizationRoleId;
	@NotNull
	@ManyToOne
	private PeriodType periodType;
	private UUID paymentMethodTypeId;

}
