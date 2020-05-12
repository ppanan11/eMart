package com.emart.jpa.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "seller", schema = "emart", catalog = "")
public class SellerEntity {
    private int id;
    private String username;
    private String password;
    private String emailid;
    private Integer contactNumber;
    private Timestamp createdDatetime;
    private String companyname;
    private String gstin;
    private String briefAboutCompany;
    private String postalAddress;
    private String website;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "emailid")
    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    @Basic
    @Column(name = "contact_number")
    public Integer getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Integer contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Basic
    @Column(name = "created_datetime")
    public Timestamp getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Timestamp createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    @Basic
    @Column(name = "companyname")
    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    @Basic
    @Column(name = "GSTIN")
    public String getGstin() {
        return gstin;
    }

    public void setGstin(String gstin) {
        this.gstin = gstin;
    }

    @Basic
    @Column(name = "brief_about_company")
    public String getBriefAboutCompany() {
        return briefAboutCompany;
    }

    public void setBriefAboutCompany(String briefAboutCompany) {
        this.briefAboutCompany = briefAboutCompany;
    }

    @Basic
    @Column(name = "postal_address")
    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    @Basic
    @Column(name = "website")
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SellerEntity that = (SellerEntity) o;

        if (id != that.id) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (emailid != null ? !emailid.equals(that.emailid) : that.emailid != null) return false;
        if (contactNumber != null ? !contactNumber.equals(that.contactNumber) : that.contactNumber != null)
            return false;
        if (createdDatetime != null ? !createdDatetime.equals(that.createdDatetime) : that.createdDatetime != null)
            return false;
        if (companyname != null ? !companyname.equals(that.companyname) : that.companyname != null) return false;
        if (gstin != null ? !gstin.equals(that.gstin) : that.gstin != null) return false;
        if (briefAboutCompany != null ? !briefAboutCompany.equals(that.briefAboutCompany) : that.briefAboutCompany != null)
            return false;
        if (postalAddress != null ? !postalAddress.equals(that.postalAddress) : that.postalAddress != null)
            return false;
        if (website != null ? !website.equals(that.website) : that.website != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (emailid != null ? emailid.hashCode() : 0);
        result = 31 * result + (contactNumber != null ? contactNumber.hashCode() : 0);
        result = 31 * result + (createdDatetime != null ? createdDatetime.hashCode() : 0);
        result = 31 * result + (companyname != null ? companyname.hashCode() : 0);
        result = 31 * result + (gstin != null ? gstin.hashCode() : 0);
        result = 31 * result + (briefAboutCompany != null ? briefAboutCompany.hashCode() : 0);
        result = 31 * result + (postalAddress != null ? postalAddress.hashCode() : 0);
        result = 31 * result + (website != null ? website.hashCode() : 0);
        return result;
    }
}
