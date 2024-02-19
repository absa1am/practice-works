package com.dsinnovators.springbootdemo.services;

import com.dsinnovators.springbootdemo.entities.Invoice;
import com.dsinnovators.springbootdemo.entities.Product;
import com.dsinnovators.springbootdemo.entities.Supplier;
import com.dsinnovators.springbootdemo.repositories.InvoiceRepository;
import com.dsinnovators.springbootdemo.repositories.ProductRepository;
import com.dsinnovators.springbootdemo.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private SupplierRepository supplierRepository;

    public void saveInvoice() {
        Invoice invoice = new Invoice();
        Set<Product> products = new HashSet<>();
        Product product = new Product();
        Supplier supplier = new Supplier();

        supplier.setName("Pran");
        supplier.setEmail("info@pran.com");
        supplier.setPhone("0000");
        supplier.setAddress("Dhaka");

        product.setName("Tank");
        product.setPurchasePrice(2);
        product.setSalePrice(5);
        product.setSupplier(supplier);

        products.add(product);

        invoice.setCustomerName("Abdus Salam");
        invoice.setInvoiceDate(new Date(2023, 1, 15));
        invoice.setProducts(products);

        supplierRepository.save(supplier);
        productRepository.save(product);
        invoiceRepository.save(invoice);
    }

    public void save(Invoice invoice) {
        invoiceRepository.save(invoice);
    }

    public Invoice getInvoice(Long id) {
        return invoiceRepository.findById(id).get();
    }

    public List<Invoice> getInvoices() {
        return invoiceRepository.findAll();
    }

}
