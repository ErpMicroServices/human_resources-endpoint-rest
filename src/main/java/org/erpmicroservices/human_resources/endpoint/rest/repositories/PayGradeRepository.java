package org.erpmicroservices.human_resources.endpoint.rest.repositories;

import org.erpmicroservices.human_resources.endpoint.rest.model.PayGrade;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface PayGradeRepository extends PagingAndSortingRepository<PayGrade, UUID> {

}
