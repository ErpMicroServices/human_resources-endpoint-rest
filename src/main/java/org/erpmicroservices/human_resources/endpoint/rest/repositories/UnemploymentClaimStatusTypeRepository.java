package org.erpmicroservices.human_resources.endpoint.rest.repositories;

import org.erpmicroservices.human_resources.endpoint.rest.model.UnemploymentClaimStatusType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface UnemploymentClaimStatusTypeRepository extends PagingAndSortingRepository<UnemploymentClaimStatusType, UUID> {

}
