package com.dsinnovators.springbootdemo.controllers;

import com.dsinnovators.springbootdemo.entities.Invoice;
import com.dsinnovators.springbootdemo.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @GetMapping("/invoice/{id}")
    public Invoice invoice(@PathVariable Long id) {
        return invoiceService.getInvoice(id);
    }

    @GetMapping("/invoices")
    public List<Invoice> invoices() {
        return invoiceService.getInvoices();
    }

}
