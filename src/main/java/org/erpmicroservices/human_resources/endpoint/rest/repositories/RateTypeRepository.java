package org.erpmicroservices.human_resources.endpoint.rest.repositories;

import org.erpmicroservices.human_resources.endpoint.rest.model.RateType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface RateTypeRepository extends PagingAndSortingRepository<RateType, UUID> {

}
