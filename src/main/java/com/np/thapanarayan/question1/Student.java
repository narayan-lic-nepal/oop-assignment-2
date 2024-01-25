package com.np.thapanarayan.question1;

public class Student extends Person {
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Student [ name='" + super.getName() +"']";
    }
}
