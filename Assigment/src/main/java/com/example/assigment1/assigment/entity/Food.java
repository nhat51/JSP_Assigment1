package com.example.assigment1.assigment.entity;

import com.example.assigment1.assigment.annotation.Column;
import com.example.assigment1.assigment.annotation.Entity;
import com.example.assigment1.assigment.annotation.Id;
import com.example.assigment1.assigment.util.SQLDataTypes;

@Entity(tableName = "foods")
public class Food {

    @Id(autoIncrement = true)
    @Column(name = "id",type = SQLDataTypes.INTEGER)
    private int id;
    @Column(name = "food_name",type = SQLDataTypes.VARCHAR255)
    private String name;
    @Column(name = "price",type = SQLDataTypes.DOUBLE)
    private double price;
    @Column(name = "description",type = SQLDataTypes.TEXT)
    private String description;
    @Column(name = "thumbnail",type = SQLDataTypes.VARCHAR255)
    private String thumbnail;
    @Column(name = "status",type = SQLDataTypes.INTEGER)
    private int Status;

    @Column(name = "categoryId", type = SQLDataTypes.INTEGER)
    private int categoryId;

    public Food() {
    }

    public Food(int id, String name, double price, String description, String thumbnail, int status, int categoryId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.thumbnail = thumbnail;
        Status = status;
        this.categoryId = categoryId;
    }

    public Food( String name, double price, String description, String thumbnail, int status, int categoryId) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.thumbnail = thumbnail;
        Status = status;
        this.categoryId = categoryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
