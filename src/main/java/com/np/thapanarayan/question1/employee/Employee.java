package com.np.thapanarayan.question1.employee;

import com.np.thapanarayan.question1.MyDate;
import com.np.thapanarayan.question1.Person;

public class Employee extends Person {
    private String office;
    private Double salary;
    private MyDate dateHired;

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }


    @Override
    public String toString() {
        return "Employee [ name='" + super.getName() +"']";
    }
}
