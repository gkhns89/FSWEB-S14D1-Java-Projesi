package com.wit.inheritance.main;

import com.wit.inheritance.model.p2.Employee;
import com.wit.inheritance.model.p2.HRManager;
import com.wit.inheritance.model.p2.JuniorDeveloper;
import com.wit.inheritance.model.p2.MidDeveloper;
import com.wit.inheritance.model.p2.SeniorDeveloper;

public class DevMain {


    public static void main(String[] args) {

        JuniorDeveloper jun1 = new JuniorDeveloper(1, "Gökhan");
        JuniorDeveloper jun2 = new JuniorDeveloper(2, "Alper");

        jun1.work();
        jun2.work();

        MidDeveloper mid1 = new MidDeveloper(3, "Su");
        MidDeveloper mid2 = new MidDeveloper(4, "Burak");

        mid1.work();
        mid2.work();

        SeniorDeveloper sen1 = new SeniorDeveloper(5,"Bilge");
        SeniorDeveloper sen2 = new SeniorDeveloper(6, "Can");

        sen1.work(55000);
        sen2.work();

        HRManager hr1 = new HRManager(1, "Devrim", new JuniorDeveloper[2], new MidDeveloper[2], new SeniorDeveloper[2]);

        hr1.work();

        hr1.addEmployee(0, jun1);
        hr1.addEmployee(0, jun2);
        hr1.addEmployee(2, jun1);
        hr1.addEmployee(0,mid2);
        hr1.addEmployee(1,mid1);
        hr1.addEmployee(0,sen1);
        hr1.addEmployee(1,sen2);

        System.out.println(hr1);
    }
}