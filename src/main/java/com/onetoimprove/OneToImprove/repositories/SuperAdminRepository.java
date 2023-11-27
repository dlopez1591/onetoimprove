package com.onetoimprove.OneToImprove.repositories;

import com.onetoimprove.OneToImprove.models.SuperAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SuperAdminRepository extends JpaRepository <SuperAdmin, Long> {
}
