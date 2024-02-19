package org.example.entities;

import jakarta.persistence.Entity;

@Entity
public class TeachingStaff extends Staff {

    private String qualification;
    private String expertise;

    public TeachingStaff() { super(); }

    public TeachingStaff(String name, String qualification, String expertise) {
        super(name);
        this.qualification = qualification;
        this.expertise = expertise;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    @Override
    public String toString() {
        return "TeachingStaff{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", qualification='" + qualification + '\'' +
                ", expertise='" + expertise + '\'' +
                '}';
    }
}
