package com.wit.inheritance.model.p2;

public class SeniorDeveloper extends Employee {

    public SeniorDeveloper(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {

        double senSalary = 50000;
        setSalary(senSalary);

        System.out.println(getName() + " is started working with Senior Developer role!\nHis/Her salary is set default to " + senSalary + ".");

    }

    public void work(double salary) {

        if (getSalary() <= 0) {
            setSalary(salary);
        }

        System.out.println(getName() + " is started working with Senior Developer role!\nHis/Her salary is set " + salary + ".");

    }
}
