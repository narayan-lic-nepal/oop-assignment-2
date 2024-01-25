package com.np.thapanarayan.question1.employee.staff;

import com.np.thapanarayan.question1.employee.Staff;

public class FullTime extends Staff {
    private double salary;

    public FullTime() {
    }

    @Override
    public Double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "FullTime [ name='" + super.getName() +"']";
    }
}
