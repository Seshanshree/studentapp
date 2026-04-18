package com.college.studentapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;
    private String gender;
    private String department;
    private String collegeName;
    private String city;
    private String state;
    private String pincode;

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getGender() { return gender; }
    public String getDepartment() { return department; }
    public String getCollegeName() { return collegeName; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getPincode() { return pincode; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setGender(String gender) { this.gender = gender; }
    public void setDepartment(String department) { this.department = department; }
    public void setCollegeName(String collegeName) { this.collegeName = collegeName; }
    public void setCity(String city) { this.city = city; }
    public void setState(String state) { this.state = state; }
    public void setPincode(String pincode) { this.pincode = pincode; }
}