package com.wit.inheritance.model.p2;

public class MidDeveloper extends Employee{

    public MidDeveloper(int id, String name) {
        super(id, name);

    }
    @Override
    public void work() {

        double midSalary = 40000;
        setSalary(midSalary);

        System.out.println(getName() + " is started working with Mid Developer role!\nHis/Her salary is set default to " + midSalary + ".");

    }

    public void work(double salary) {

        if (getSalary() <= 0) {
            setSalary(salary);
        }

        System.out.println(getName() + " is started working with Mid Developer role!\nHis/Her salary is set " + salary + ".");

    }
}
