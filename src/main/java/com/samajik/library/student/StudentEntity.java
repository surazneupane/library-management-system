package com.samajik.library.student;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class StudentEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer libraryId;

    private Integer rollNo;
    private String firstName;
    private String lastName;
    private String address;
    private String semester;
    private Integer batchOfAdmission;

    public Integer getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(Integer libraryId) {
        this.libraryId = libraryId;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
       this.address = address;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Integer getBatchOfAdmission() {
        return batchOfAdmission;
    }

    public void setBatchOfAdmission(Integer batchOfAdmission) {
        this.batchOfAdmission = batchOfAdmission;
    }
}
