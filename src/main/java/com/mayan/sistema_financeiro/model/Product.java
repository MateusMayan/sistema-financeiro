package com.mayan.sistema_financeiro.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Range;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Product implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "O nome não pode ser nulo")
    private String name;

    @NotNull(message = "O tipo não pode ser nulo")
    private String type;

    @NotNull(message = "A categoria não pode ser nula")
    private String category;

    @NotNull(message = "A marca não pode ser nulo")
    private String brand;

    @NotNull(message = "A quantidade em estoque não pode ser nula")
    @Range(min = 0)
    private int amountStock;

    @NotNull(message = "O valor de venda não pode ser nulo")
    @Range(min = 0)
    private Double salesValue;

    @NotNull
    private boolean active = true;

    @CreatedDate
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime createdAt = LocalDateTime.now();

    @LastModifiedDate
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime updatedAt = LocalDateTime.now();

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

    public Product() {
        super();
    }

    public Product(Integer id, String name, String type, String category, String brand, int amountStock, Double salesValue) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.category = category;
        this.brand = brand;
        this.amountStock = amountStock;
        this.salesValue = salesValue;
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

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setAmountStock(int amountStock) {
        this.amountStock = amountStock;
    }

    public int getAmountStock() {
        return amountStock;
    }

    public void setSalesValue(Double salesValue) {
        this.salesValue = salesValue;
    }

    public Double getSalesValue() {
        return salesValue;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean getActive() {
        return active;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getUpdatedAt() {
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
        Product other = (Product) obj;
        return Objects.equals(id, other.id);
    }
}
