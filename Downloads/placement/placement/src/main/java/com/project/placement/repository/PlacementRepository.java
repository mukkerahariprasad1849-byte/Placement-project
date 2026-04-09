package com.project.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.placement.model.Placement;

public interface PlacementRepository extends JpaRepository<Placement, Integer> {
}
