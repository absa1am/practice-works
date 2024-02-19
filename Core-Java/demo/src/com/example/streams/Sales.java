package com.example.streams;

import java.time.LocalDate;
import java.util.Objects;

public class Sales {

    private String product;
    private LocalDate date;
    private int amount;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "product='" + product + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sales sales = (Sales) o;
        return amount == sales.amount && Objects.equals(product, sales.product) && Objects.equals(date, sales.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, date, amount);
    }

}
