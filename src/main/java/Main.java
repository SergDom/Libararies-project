import javax.management.BadAttributeValueExpException;

public class Main {

    public static void listOfEmployee(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println((arr[i]));
            }
        }
    }

    public static double sumOfSalary(Employee[] arr) {
        double sumSalary = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                sumSalary = sumSalary + arr[i].getSalary();
            } else break;
        }
        return sumSalary;
    }

    public static double minOfSalary(Employee[] arr) {
        double min = maxOfSalary(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (min > arr[i].getSalary()) {
                    min = arr[i].getSalary();
                }
            } else break;
        }
        return min;
    }

    public static double maxOfSalary(Employee[] arr) {
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (max < arr[i].getSalary()) {
                    max = arr[i].getSalary();
                }
            } else break;
        }
        return max;
    }

    public static double avrOfSalary(Employee[] arr) {
        double avrSalary = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                avrSalary = avrSalary + arr[i].getSalary() / arr.length;
            } else break;
        }
        return avrSalary;
    }

    public static void employeeNames(Employee[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != null) {
                System.out.println(arr[i].getLastName() + " " + arr[i].getFirstName() + " " + arr[i].getSurName());
            }
    }

    public static void indexOfSalary(Employee employees[], double index) {
        for (int i = 0; i < employees.length; i++) {
            double newSalary = employees[i].getSalary() + employees[i].getSalary() * index;
            employees[i].setSalary(newSalary);
        }
    }

    public static double minOfSalaryDepartment(Employee[] arr, int department) {
        double minSalary = maxOfSalary(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getDepartment() == department) {
                if (minSalary > arr[i].getSalary()) {
                    minSalary = arr[i].getSalary();
                }
            }
        }
        return minSalary;
    }

    public static double maxOfSalaryDepartment(Employee[] arr, int department) {
        double maxSalary = minOfSalary(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getDepartment() == department) {
                if (maxSalary < arr[i].getSalary()) {
                    maxSalary = arr[i].getSalary();
                }
            }
        }
        return maxSalary;
    }

    public static double sumOfSalaryDepartment(Employee[] arr, int department) {
        double sumSalary = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getDepartment() == department) {
                sumSalary = sumSalary + arr[i].getSalary();
            }
        }
        return sumSalary;
    }

    public static double avrOfSalaryDepartment(Employee[] arr, int department) {
        double avrSalary = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getDepartment() == department) {
                avrSalary = avrSalary + arr[i].getSalary() / arr[i].getDepartment();
            }
        }
        return avrSalary;
    }


    public static void indexOfSalaryDepartment(Employee employees[], int department, double departmentIndex) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                double increaseSalary = employees[i].getSalary() + employees[i].getSalary() * departmentIndex;
                employees[i].setSalary(increaseSalary);
            }
        }
    }

    public static void employeeNamesDepartment(Employee[] arr, int department) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].getDepartment() == department) {
                System.out.println(arr[i].getLastName() + " " + arr[i].getFirstName() + " " + arr[i].getSurName() + " " + arr[i].getSalary());
            }
    }

    public static void employeeWithLowestSalary(Employee[] arr, double exampleSalary) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getSalary() < exampleSalary) {
                    System.out.println("Табельный номер: " + arr[i].getId() + " Фамилия: " + arr[i].getLastName() + " Имя: " + arr[i].getFirstName() + " Отчество: " +
                            arr[i].getSurName() + " с зарплатой: " + arr[i].getSalary() + " руб");
                }
            }
        }
    }

    public static void employeeWithHighestSalary(Employee[] arr, double exampleSalary) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getSalary() > exampleSalary) {
                    System.out.println("Табельный номер: " + arr[i].getId() + " Фамилия: " + arr[i].getLastName() + " Имя: " + arr[i].getFirstName() + " Отчество: " +
                            arr[i].getSurName() + " с зарплатой: " + arr[i].getSalary() + " руб");
                }
            }
        }
    }

    public static void main(String[] args) throws BadAttributeValueExpException {

        Employee[] employees = new Employee[10];

        Employee employee1 = new Employee("ivanov", "ivan", "ivanovich", 1, 150000);
        Employee employee2 = new Employee("dmitriev", "Sergey", "aleksandrovich", 2, 160000);
        Employee employee3 = new Employee("Seleznev", "Aleksander", "Alekseevich", 3, 145000);
        Employee employee4 = new Employee("Petrov", "Ilia", "Sergeevich", 4, 180000);
        Employee employee5 = new Employee("Vasechkin", "Anton", "Genadeivich", 5, 170000);
        Employee employee6 = new Employee("Ivanova", "Ylia", "Viktorovna", 5, 185000);
        Employee employee7 = new Employee("Osipova", "Galina", "Sergeevna", 2, 143000);
        Employee employee8 = new Employee("Smirnova", "Sofia", "Dmitreevna", 1, 167000);
        Employee employee9 = new Employee("Fedorova", "Diana", "Vladimirovna", 3, 125000);
        Employee employee10 = new Employee("Pavlova", "Elena", "Aleksandrovna", 4, 190000);

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        employees[5] = employee6;
        employees[6] = employee7;
        employees[7] = employee8;
        employees[8] = employee9;
        employees[9] = employee10;

        listOfEmployee(employees);
        System.out.println("==================================");
        System.out.println("Сумма затрат по зарплате: " + sumOfSalary(employees));
        System.out.println("Минимальная зарплата сотрудника: " + minOfSalary(employees));
        System.out.println("Максимальная зарплата сотрудника: " + maxOfSalary(employees));
        System.out.println("Средняя зарплата сотрудников: " + avrOfSalary(employees));
        System.out.println("==================================");
        employeeNames(employees);
        System.out.println("==================================");
        indexOfSalary(employees, 0.2);
        listOfEmployee(employees);
        System.out.println("==================================");
        System.out.println("Минимальная зарплата сотрудника в отделе: " + minOfSalaryDepartment(employees, 4));
        System.out.println("Максимальная зарплата сотрудника в отделе: " + maxOfSalaryDepartment(employees, 2));
        System.out.println("Сумма затрат по зарплате в отделе: " + sumOfSalaryDepartment(employees, 2));
        System.out.println("Средняя зарплата сотрудников в отделе: " + avrOfSalaryDepartment(employees, 2));
        System.out.println("==================================");
        employeeNamesDepartment(employees, 2);
        indexOfSalaryDepartment(employees, 2, 0.4);
        employeeNamesDepartment(employees, 3);
        System.out.println("==================================");
        employeeWithLowestSalary(employees, 150000);
        employeeWithHighestSalary(employees, 230000);

    }
}
