package com.dsinnovators.springbootdemo.controllers;

import com.dsinnovators.springbootdemo.entities.Supplier;
import com.dsinnovators.springbootdemo.services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/supplier/create")
    public Supplier create(@RequestBody Supplier supplier) {
        return supplierService.createSupplier(supplier);
    }

    @GetMapping("/suppliers")
    public List<Supplier> suppliers() {
        return supplierService.getSuppliers();
    }

}
