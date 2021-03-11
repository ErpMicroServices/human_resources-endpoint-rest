package org.erpmicroservices.human_resources.endpoint.rest.repositories;

import org.erpmicroservices.human_resources.endpoint.rest.model.Position;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface PositionRepository extends PagingAndSortingRepository<Position, UUID> {

}
