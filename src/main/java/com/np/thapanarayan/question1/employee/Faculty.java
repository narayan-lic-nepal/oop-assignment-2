package com.np.thapanarayan.question1.employee;

public class Faculty extends Employee {

    private String officeHour;
    private String rank;

    public String getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }


    @Override
    public String toString() {
        return "Faculty [ name='" + super.getName() +"']";
    }
}
