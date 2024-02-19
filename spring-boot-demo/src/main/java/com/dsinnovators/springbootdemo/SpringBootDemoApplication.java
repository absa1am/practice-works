package com.dsinnovators.springbootdemo;

import com.dsinnovators.springbootdemo.services.InvoiceService;
import com.dsinnovators.springbootdemo.services.ProductService;
import com.dsinnovators.springbootdemo.services.SupplierService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

		SupplierService supplierService = context.getBean(SupplierService.class);
		ProductService productService = context.getBean(ProductService.class);
		InvoiceService invoiceService = context.getBean(InvoiceService.class);

//		supplierService.saveSupplier();
//		productService.saveProduct();
//		invoiceService.saveInvoice();

//		System.out.println(productService.getAllProductsBySupplierId(1L));
	}

}
