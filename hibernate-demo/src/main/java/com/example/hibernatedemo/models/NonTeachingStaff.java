package com.example.hibernatedemo.models;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "NS")
public class NonTeachingStaff extends Staff {

    private String areaExpertise;

    public NonTeachingStaff() { }

    public NonTeachingStaff(int id, String name, String areaExpertise) {
        super(id, name);
        this.areaExpertise = areaExpertise;
    }

    public String getAreaExpertise() {
        return areaExpertise;
    }

    public void setAreaExpertise(String areaExpertise) {
        this.areaExpertise = areaExpertise;
    }

    @Override
    public String toString() {
        return "NonTeachingStaff{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", areaExpertise='" + areaExpertise + '\'' +
                '}';
    }
}
