package com.dsinnovators.demo.services;

import com.dsinnovators.demo.respositories.CreateTableRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateTableService {

    private CreateTableRepository createTableRepository;

    @Autowired
    public CreateTableService(CreateTableRepository createTableRepository) {
        this.createTableRepository = createTableRepository;
    }

    @PostConstruct
    public void createDatabase() {
        createTableRepository.createEmployeeTable();
    }

}
