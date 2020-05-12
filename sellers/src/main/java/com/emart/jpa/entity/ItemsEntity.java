package com.emart.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "items", schema = "emart", catalog = "")
public class ItemsEntity {
    private int id;
    private int subcategoryId;
    private int price;
    private String itemName;
    private int categoryId;
    private String description;
    private int stockNumber;
    private String remarks;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "subcategory_id")
    public int getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(int subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    @Basic
    @Column(name = "price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Basic
    @Column(name = "item_name")
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Basic
    @Column(name = "category_id")
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "stock_number")
    public int getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(int stockNumber) {
        this.stockNumber = stockNumber;
    }

    @Basic
    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemsEntity that = (ItemsEntity) o;

        if (id != that.id) return false;
        if (subcategoryId != that.subcategoryId) return false;
        if (price != that.price) return false;
        if (categoryId != that.categoryId) return false;
        if (stockNumber != that.stockNumber) return false;
        if (itemName != null ? !itemName.equals(that.itemName) : that.itemName != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + subcategoryId;
        result = 31 * result + price;
        result = 31 * result + (itemName != null ? itemName.hashCode() : 0);
        result = 31 * result + categoryId;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + stockNumber;
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        return result;
    }
}
