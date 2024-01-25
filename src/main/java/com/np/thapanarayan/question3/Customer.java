package com.np.thapanarayan.question3;

public class Customer {

    private int id;
    private String name;
    private Membership membershipType;


    public Customer() {
    }

    public Customer(int id, String name, Membership membershipType) {
        this.id = id;
        this.name = name;
        this.membershipType = membershipType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Membership getMembershipType() {
        return membershipType;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMembershipType(Membership membershipType) {
        this.membershipType = membershipType;
    }

    @Override
    public String toString() {
        return "Customer[" + "id='" + id + "', name='" + name +
                "', membershipType=" + membershipType + "']";
    }
}
