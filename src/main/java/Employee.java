import org.apache.commons.lang3.StringUtils;

import javax.management.BadAttributeValueExpException;

public class Employee {
    private String lastName;
    private String firstName;
    private String surName;

    private int department;
    private double salary;
    private int id;
    private static int counter = 1;


    public Employee(String lastName, String firstName, String surName, int department, double salary) throws BadAttributeValueExpException {
        setLastName(lastName);
        setFirstName(firstName);
        setSurName(surName);
        this.department = department;
        this.salary = salary;
        id = counter++;

    }

    public void setLastName(String lastName) throws BadAttributeValueExpException {
        if (!StringUtils.isAlpha(lastName)) {
            throw new BadAttributeValueExpException("400 Bad Request");
        } else {
            this.lastName = StringUtils.capitalize(lastName);
        }
    }

    public void setFirstName(String firstName) throws BadAttributeValueExpException {
        if (!StringUtils.isAlpha(firstName)) {
            throw new BadAttributeValueExpException("400 Bad Request");
        } else {
            this.firstName = StringUtils.capitalize(firstName);
        }
    }

    public void setSurName(String surName) throws BadAttributeValueExpException {
        if (!StringUtils.isAlpha(surName)) {
            throw new BadAttributeValueExpException("400 Bad Request");
        } else {
            this.surName = StringUtils.capitalize(surName);
        }
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Сотрудник: " + "Фамилия: " + lastName + " Имя: " + firstName + " Отчество: " + surName + " Отдел №: " + department +
                " Зарплата: " + salary;
    }


}
