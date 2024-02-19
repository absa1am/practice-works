package com.dsinnovators.liquibase.repositories;

import com.dsinnovators.liquibase.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

    @Query(value = "SELECT * FROM countries OFFSET ?1 LIMIT ?2", nativeQuery = true)
    List<Country> getCountriesWithPagination(int page, int size);

}
