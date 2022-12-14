package com.elves.ird.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elves.ird.entities.Satellite;

public interface SatelliteRepository extends JpaRepository<Satellite, Long>{

}
