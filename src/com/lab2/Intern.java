package com.lab2;

public class Intern extends Employee{
    int MAX_SALARY = 20000;
    public Intern(String name, String email, int age, int salary) {
        super(name, email, age, salary);

        if (salary > MAX_SALARY) {
            super.setSalary(MAX_SALARY);
        }
    }

    @Override
    public String toString() {
        return "Intern{" +
                "MAX_SALARY=" + MAX_SALARY +
                '}';
    }

    public void setSalary(int salary){
        if (salary > MAX_SALARY) {

            super.setSalary(MAX_SALARY);
        } else {
            super.setSalary(salary);

        }

    }
}
