package com.np.thapanarayan.question1;

import com.np.thapanarayan.question1.employee.Employee;
import com.np.thapanarayan.question1.employee.Faculty;
import com.np.thapanarayan.question1.employee.staff.FullTime;
import com.np.thapanarayan.question1.employee.staff.PartTime;

public class MainApp {

    public static void main(String[] args) {
        printPerson();

        printStudent();

        printEmployee();

        printFaculty();

        printPartTimeStaff();

        printFullTimeStaff();
    }

    private static void printPerson() {
        Person person = new Person();
        person.setName("Ram");
        person.setAddress("Kathmandu");
        person.setPhoneNumber("9841234567");
        person.setEmail("ram@gmail.com");
        System.out.println(person);
    }

    private static void printStudent() {
        Student student = new Student();
        student.setName("Hari");
        student.setAddress("Kathmandu");
        student.setPhoneNumber("9842345678");
        student.setEmail("hari@gmail.com");
        student.setStatus(Status.JUNIOR);
        System.out.println(student);
    }

    private static void printEmployee() {
        Employee employee = new Employee();
        employee.setName("Ramesh");
        employee.setAddress("Kathmandu");
        employee.setPhoneNumber("9842345678");
        employee.setEmail("ramesh@gmail.com");
        employee.setOffice("Singha Durbar");
        employee.setDateHired(new MyDate(2020, 12, 01));
        employee.setSalary(25000d);
        System.out.println(employee);
    }

    private static void printFaculty() {
        Faculty faculty = new Faculty();
        faculty.setName("Shyam");
        faculty.setAddress("Baneshwor");
        faculty.setPhoneNumber("9842945678");
        faculty.setEmail("shyam@gmail.com");
        faculty.setOffice("Singha Durbar");
        faculty.setDateHired(new MyDate(2021, 01, 06));
        faculty.setSalary(35000d);
        faculty.setOfficeHour("10:00AM-04:00PM");
        faculty.setRank("Subba");
        System.out.println(faculty);
    }

    private static void printFullTimeStaff() {
        FullTime staff = new FullTime();
        staff.setName("Prakash");
        staff.setAddress("Old Baneshwor");
        staff.setPhoneNumber("984294589");
        staff.setEmail("prakash@gmail.com");
        staff.setOffice("Singha Durbar");
        staff.setDateHired(new MyDate(2018, 01, 06));
        staff.setSalary(32000d);
        staff.setTitle("Engineer I");
        System.out.println(staff);
    }

    private static void printPartTimeStaff() {
        PartTime partTime = new PartTime();
        partTime.setName("Chandra");
        partTime.setAddress("Old Baneshwor");
        partTime.setPhoneNumber("984294589");
        partTime.setEmail("chandra@gmail.com");
        partTime.setOffice("Singha Durbar");
        partTime.setDateHired(new MyDate(2020, 05, 06));
        partTime.setSalary(20000d);
        partTime.setTitle("Fire And Safety Staff");
        System.out.println(partTime);
    }


}
