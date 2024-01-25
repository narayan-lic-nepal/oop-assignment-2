package com.np.thapanarayan.question1.employee;

import com.np.thapanarayan.question1.employee.Employee;

public abstract class Staff extends Employee {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff [ name='" + super.getName() +"']";
    }
}
