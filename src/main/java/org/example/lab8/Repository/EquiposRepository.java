package org.example.lab8.Repository;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.example.lab8.Entity.Equipos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquiposRepository extends JpaRepository<Equipos, Integer> {

}
