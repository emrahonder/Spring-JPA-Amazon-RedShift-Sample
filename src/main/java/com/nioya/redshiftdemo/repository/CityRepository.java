package com.nioya.redshiftdemo.repository;


import com.nioya.redshiftdemo.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "cities", path = "public")
public interface CityRepository extends JpaRepository<City, Integer> {
}