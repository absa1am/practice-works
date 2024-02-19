package com.dsinnovators.demo.respositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CreateTableRepositoryImpl implements CreateTableRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CreateTableRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void createEmployeeTable() {
        String sql = "CREATE TABLE IF NOT EXISTS Employees (" +
                "id SERIAL PRIMARY KEY," +
                "name VARCHAR(50) NOT NULL," +
                "email VARCHAR(50) NOT NULL" +
                ");";

        jdbcTemplate.execute(sql);
    }

}
