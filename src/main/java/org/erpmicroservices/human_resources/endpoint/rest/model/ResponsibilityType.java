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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode
public class ResponsibilityType extends AbstractPersistable<UUID> {
 @NotBlank
 @NotNull
 private String description;

 @OneToMany
 @JoinColumn(name = "responsibility_type_id")
 private List<ValidResponsibility> validResponsibilities = new ArrayList<>();
}
