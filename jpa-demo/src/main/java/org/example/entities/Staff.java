package org.example.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "staffs")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Staff implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    public Staff() { }

    public Staff(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
