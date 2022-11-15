public class Employee {
    private String lastName;
    private String firstName;
    private String surName;

    private int department;
    private double salary;
    private int id;
    private static int counter = 1;


    public Employee(String lastName, String firstName, String surName, int department, double salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.surName = surName;
        this.department = department;
        this.salary = salary;
        id = counter++;

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
