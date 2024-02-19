package com.example.streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesService {

    private List<Sales> sales = new ArrayList<>();

    public List<Sales> getSales() {
        Sales sale = new Sales();

        sale.setProduct("Product - 1");
        sale.setDate(LocalDate.of(2023, 4, 4));
        sale.setAmount(5000);

        sales.add(sale);

        sale.setProduct("Product - 2");
        sale.setDate(LocalDate.of(2023, 4, 6));
        sale.setAmount(4500);

        sales.add(sale);

        return sales;
    }

}
