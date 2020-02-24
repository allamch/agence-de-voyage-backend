package com.entities;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity


public class Users implements Serializable {
    public Users() {
    }

    public Users(String firstName, String lastName, String email, String password, Boolean enabled, String phoneNumber, Date createdDate, long countryId, int gender, String imagePath, int statue, int isDeleted, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.enabled = enabled;

        this.phoneNumber = phoneNumber;
        this.createdDate = createdDate;
        this.countryId = countryId;
        this.gender = gender;
        this.imagePath = imagePath;
        this.statue = statue;
        this.isDeleted = isDeleted;
        this.id = id;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;
    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="enabled")
    private Boolean enabled;
    @Column(name="phone_number")
    private String phoneNumber;
    @Column(name="created_data")
    private Date createdDate;
    @Column(name="country_id")
    private long countryId;
    @Column(name="society_id")
    private long society_id;
    @Column(name="role_id")
    private long role_id;
    @Column(name="gender")
    private int gender;
    @Column (name="image_path")
    private  String imagePath;
    @Column(name="satut_user")
    private int statue;
    @Column(name="is_deleted")
    private int isDeleted;

    @ManyToOne
    @JoinColumn(name = "jardin_id", referencedColumnName = "jardin_id", nullable = false, insertable = false, updatable = false)
    private Jardin jardin;

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "role_id", nullable = false, insertable = false, updatable = false)
    private Role role;

    public Boolean getEnabled() {
        return enabled;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getStatue() {
        return statue;
    }

    public void setStatue(int statue) {
        this.statue = statue;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Jardin getSociety() {
        return jardin;
    }

    public void setSociety(Jardin society) {
        this.jardin = jardin;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public long getRole_id() {
        return role_id;
    }

    public void setRole_id(long role_id) {
        this.role_id = role_id;
    }

    public long getSociety_id() {
        return society_id;
    }

    public void setSociety_id(long society_id) {
        this.society_id = society_id;
    }
}
