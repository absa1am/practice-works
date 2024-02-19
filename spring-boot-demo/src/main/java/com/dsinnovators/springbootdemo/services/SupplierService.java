package com.dsinnovators.springbootdemo.services;

import com.dsinnovators.springbootdemo.entities.Supplier;
import com.dsinnovators.springbootdemo.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public Supplier createSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    public Supplier getSupplier(Long id) {
        return supplierRepository.findById(id).get();
    }

    public List<Supplier> getSuppliers() {
        return supplierRepository.findAll();
    }

}
