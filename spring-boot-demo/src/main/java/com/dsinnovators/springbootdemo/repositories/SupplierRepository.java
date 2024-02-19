package com.dsinnovators.springbootdemo.repositories;

import com.dsinnovators.springbootdemo.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

}
