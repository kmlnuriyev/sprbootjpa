package com.kml.sprbootjpa.repository;

import com.kml.sprbootjpa.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlienRepository extends JpaRepository<Alien, Integer> {
}
