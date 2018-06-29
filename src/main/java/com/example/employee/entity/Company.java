package com.example.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {
    @Id
    Integer id;
    @Column
    String companyName;
    @Column
    Integer employeesNumber;

    public Company(Integer id,String companyName,Integer employeesNumber){
        this.id = id;
        this.companyName = companyName;
        this.employeesNumber = employeesNumber;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    public Integer getId(){
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }


}
