package com.onetoimprove.OneToImprove.repositories;

import com.onetoimprove.OneToImprove.models.NoticiaOTI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NoticiaOTIRepository extends JpaRepository<NoticiaOTI, Long> {
}
