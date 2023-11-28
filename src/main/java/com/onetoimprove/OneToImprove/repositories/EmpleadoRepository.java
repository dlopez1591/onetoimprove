package com.onetoimprove.OneToImprove.repositories;

import com.onetoimprove.OneToImprove.models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmpleadoRepository extends JpaRepository <Empleado, Long> {
}
