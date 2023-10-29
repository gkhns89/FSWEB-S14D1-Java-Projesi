package com.wit.inheritance.model.p2;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {

        double junSalary = 30000;
        setSalary(junSalary);

        System.out.println(getName() + " is started working with Junior Developer role!\nHis/Her salary is set default to " + junSalary + ".");

    }

    public void work(double salary) {

        if (getSalary() <= 0) {
            setSalary(salary);
        }

        System.out.println(getName() + " is started working with Junior Developer role!\nHis/Her salary is set " + salary + ".");

    }
}
