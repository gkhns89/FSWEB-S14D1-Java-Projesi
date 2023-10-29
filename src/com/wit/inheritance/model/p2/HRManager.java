package com.wit.inheritance.model.p2;

import java.util.Arrays;

public class HRManager extends Employee {

    private JuniorDeveloper[] junDevs;
    private MidDeveloper[] midDevs;
    private SeniorDeveloper[] senDevs;

    public HRManager(int id, String name, JuniorDeveloper[] junDevs, MidDeveloper[] midDevs, SeniorDeveloper[] senDevs) {
        super(id, name);
        this.junDevs = junDevs;
        this.midDevs = midDevs;
        this.senDevs = senDevs;
    }


    @Override
    public void work() {
        double hrSalary = 35000;
        setSalary(hrSalary);

        System.out.println(getName() + " is started working with HR Manager role!\nHis/Her salary is set " + hrSalary + ".");

    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper) {
        try {

            if (junDevs[index] == null) {

                junDevs[index] = juniorDeveloper;

            } else {

                System.out.println("Related index is not empty!");
            }
        } catch (ArrayIndexOutOfBoundsException arrayEx) {

            System.out.println("Given index is out of array range!\n"+arrayEx.getMessage());

        }
    }

    public void addEmployee(int index, MidDeveloper midDeveloper) {
        try {

            if (midDevs[index] == null) {

                midDevs[index] = midDeveloper;

            } else {

                System.out.println("Related index is not empty!");
            }
        } catch (ArrayIndexOutOfBoundsException arrayEx) {

            System.out.println("Given index is out of array range!\n"+arrayEx.getMessage());

        }
    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloper) {
        try {

            if (senDevs[index] == null) {

                senDevs[index] = seniorDeveloper;

            } else {

                System.out.println("Related index is not empty!");
            }
        } catch (ArrayIndexOutOfBoundsException arrayEx) {

            System.out.println("Given index is out of array range!\n"+arrayEx.getMessage());

        }
    }

    @Override
    public String toString() {
        return "Role: HR Manager (" + getName() + ")\n" +
                "Junior Devs=" + Arrays.toString(junDevs) + "\nMid Devs=" + Arrays.toString(midDevs) + "\nSenior Devs=" + Arrays.toString(senDevs);
    }
}




