package com.onetoimprove.OneToImprove.repositories;

import com.onetoimprove.OneToImprove.models.RepresentanteLegal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RepresentanteLegalRepository extends JpaRepository <RepresentanteLegal,Long> {
}
