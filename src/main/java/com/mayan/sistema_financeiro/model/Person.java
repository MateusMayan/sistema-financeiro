package com.mayan.sistema_financeiro.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import com.mayan.sistema_financeiro.enums.PersonType;
@Entity
public abstract class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String document;
    private PersonType personType;

    private Boolean active;

    @JsonFormat(pattern = "dd/MM/yyyy:HH:mm:ss")
    private Date createdAt;
    @JsonFormat(pattern = "dd/MM/yyyy:HH:mm:ss")
    private Date updatedAt;


    public Person() {
        super();
    }

    public Person(Integer id, String name, String email, String document, Boolean active, Date createdAt, Date updatedAt, PersonType personType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.document = document;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.personType = personType;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }

    public PersonType getPersonType() {
        return personType;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getActive() {
        return active;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return Objects.equals(id, other.id);
    }
}
