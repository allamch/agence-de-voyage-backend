package com.entities;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
@Entity
public class Jardin implements Serializable {
    public Jardin() {
    }
    public Jardin(int jardinId,String jardinName, String jardinImagePath, long countryId, String city, String address, String codePostal, String email, Date createdDate,int isDeleted, String phoneNumber  ) {
        this.jardinId = jardinId;
        this.jardinName = jardinName;
        this.jardinImagePath = jardinImagePath;
        this.countryId = countryId;
        this.city = city;
        this.address = address;
        this.codePostal = codePostal;
        this.email = email;
        this.createdDate = createdDate;
        this.isDeleted = isDeleted;
        this.phoneNumber = phoneNumber;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Jardin_id")
    private long jardinId;



    @Column(name="jardinName")
    private String jardinName;
    @Column(name="jardinImagePath")
    private String jardinImagePath;
    @Column(name="countryId")
    private long countryId;
    @Column(name="city")
    private String city;
    @Column(name="address")
    private String address;
    @Column(name="codePostal")
    private String codePostal;
    @Column(name="email")
    private String email;
    @Column(name="createdDate")
    private Date createdDate;
    @Column(name="isDeleted")
    private int isDeleted;
    @Column(name="phoneNumber")
    private String phoneNumber;


    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getJardinImagePath() {
        return jardinImagePath;
    }

    public void setJardinImagePath(String jardinImagePath) {
        this.jardinImagePath = jardinImagePath;
    }

    public String getJardinName() {
        return jardinName;
    }

    public void setJardinName(String jardinName) {
        this.jardinName = jardinName;
    }

    public long getJardinId() {
        return jardinId;
    }

    public void setJardinId(long jardinId) {
        this.jardinId = jardinId;
    }

    public long getCountryId() {
        return countryId;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getEmail() {
        return email;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /*@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "society")
    private Set<Users> users = new HashSet<>();*/
}
