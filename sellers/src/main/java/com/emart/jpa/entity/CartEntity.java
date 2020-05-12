package com.emart.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "cart", schema = "emart", catalog = "")
public class CartEntity {
    private int id;
    private String buyerUsername;
    private int itemId;
    private int itemName;
    private Integer count;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "buyer_username")
    public String getBuyerUsername() {
        return buyerUsername;
    }

    public void setBuyerUsername(String buyerUsername) {
        this.buyerUsername = buyerUsername;
    }

    @Basic
    @Column(name = "item_id")
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "item_name")
    public int getItemName() {
        return itemName;
    }

    public void setItemName(int itemName) {
        this.itemName = itemName;
    }

    @Basic
    @Column(name = "count")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CartEntity that = (CartEntity) o;

        if (id != that.id) return false;
        if (itemId != that.itemId) return false;
        if (itemName != that.itemName) return false;
        if (buyerUsername != null ? !buyerUsername.equals(that.buyerUsername) : that.buyerUsername != null)
            return false;
        if (count != null ? !count.equals(that.count) : that.count != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (buyerUsername != null ? buyerUsername.hashCode() : 0);
        result = 31 * result + itemId;
        result = 31 * result + itemName;
        result = 31 * result + (count != null ? count.hashCode() : 0);
        return result;
    }
}
