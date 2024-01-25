package com.np.thapanarayan.question1.employee.staff;

import com.np.thapanarayan.question1.employee.Staff;

public class PartTime extends Staff {

    private double salary;

    @Override
    public Double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "PartTime [ name='" + super.getName() +"']";
    }
}
