package com.emart.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "subcategory", schema = "emart", catalog = "")
public class SubcategoryEntity {
    private int subcategoryId;
    private String subcategoryName;
    private int categoryId;
    private String briefDetails;

    @Id
    @Column(name = "subcategory_id")
    public int getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(int subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    @Basic
    @Column(name = "subcategory_name")
    public String getSubcategoryName() {
        return subcategoryName;
    }

    public void setSubcategoryName(String subcategoryName) {
        this.subcategoryName = subcategoryName;
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
    @Column(name = "brief_details")
    public String getBriefDetails() {
        return briefDetails;
    }

    public void setBriefDetails(String briefDetails) {
        this.briefDetails = briefDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubcategoryEntity that = (SubcategoryEntity) o;

        if (subcategoryId != that.subcategoryId) return false;
        if (categoryId != that.categoryId) return false;
        if (subcategoryName != null ? !subcategoryName.equals(that.subcategoryName) : that.subcategoryName != null)
            return false;
        if (briefDetails != null ? !briefDetails.equals(that.briefDetails) : that.briefDetails != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subcategoryId;
        result = 31 * result + (subcategoryName != null ? subcategoryName.hashCode() : 0);
        result = 31 * result + categoryId;
        result = 31 * result + (briefDetails != null ? briefDetails.hashCode() : 0);
        return result;
    }
}
