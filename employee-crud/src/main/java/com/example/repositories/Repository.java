package com.example.repositories;

import java.util.List;

public interface Repository<Entity, Id> {

    List<Entity> findAll();
    Entity findById(Id id);
    void save(Entity entity);
    void delete(Entity entity);

}
