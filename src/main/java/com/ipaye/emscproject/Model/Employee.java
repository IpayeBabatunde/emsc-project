package com.ipaye.emscproject.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name="employee_table")
@Data
public class Employee implements Serializable {

    @Serial
    private static final long serialVersionUID = 1954355911137869829L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Id")
    private Long id;

    @Column(name="First_Name")
    private String firstName;

    @Column(name="Last_Name")
    private String lastName;

    @Column(name="Email_Id")
    private String emailId;

    @Column(name="Job_Title")
    private String jobTitle;

    @Column(name="Department_Name")
    private String departmentName;

    @Column(name="Contact")
    private String contact;

    public Employee(){

    }
    public Employee(Long id, String firstName, String lastName, String emailId, String jobTitle, String departmentName, String contact) {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.emailId=emailId;
        this.jobTitle=jobTitle;
        this.departmentName=departmentName;
        this.contact=contact;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName=lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId=emailId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle=jobTitle;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName=departmentName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact=contact;
    }
}
