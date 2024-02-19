package org.example.entities;

import jakarta.persistence.Entity;

@Entity
public class NonTeachingStaff extends Staff {

    private String areaExpertise;

    public NonTeachingStaff() { super(); }

    public NonTeachingStaff(String name, String areaExpertise) {
        super(name);
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
