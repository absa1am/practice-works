package com.dsinnovators.springbootdemo.repositories;

import com.dsinnovators.springbootdemo.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
