package com.workintech.developers;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(int name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" senior developer starts to working...");
    }
}
