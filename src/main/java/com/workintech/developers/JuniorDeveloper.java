package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(int name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" junior developer starts to working...");
    }
}
