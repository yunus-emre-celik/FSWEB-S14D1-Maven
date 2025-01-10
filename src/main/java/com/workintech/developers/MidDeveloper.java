package com.workintech.developers;

public class MidDeveloper extends Employee{
    public MidDeveloper(int name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" mid developer starts to working...");
    }
}
