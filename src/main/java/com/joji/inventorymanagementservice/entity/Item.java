package com.joji.inventorymanagementservice.entity;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false, precision = 10, scale=2)
    private BigDecimal price;

    @Column(name = "stock_quantity", nullable = false)
    private Integer stockQuantity;

    public Item(){
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public Integer getStockQuantity(){
        return stockQuantity;
    }

    public void setId(Long id){
        this.id=id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setPrice(BigDecimal price){
        this.price = price;
    }

    public void setStockQuantity(Integer stockQuantity){
        this.stockQuantity = stockQuantity;
    }
}
