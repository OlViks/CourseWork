public class CourseWork {
    public static void main(String[] args) {
        System.out.println("Course Work!");
        System.out.println();

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Petov U.A. ", 1, 35_000);
        employees[1] = new Employee("Ivanov T.A. ", 2, 135_000);
        employees[2] = new Employee("Mironov A.S. ", 3, 15_000);
        employees[3] = new Employee("Saltkov B.A. ", 5, 95_000);
        employees[4] = null;
        employees[5] = new Employee("Gerasimov T.T. ", 2, 150_000);
        employees[6] = new Employee("Satirov J.A. ", 1, 2_000);
        employees[7] = new Employee("Tronov K.T. ", 3, 15_000);
        employees[8] = new Employee("Sergeev H.A. ", 4, 40_000);
        employees[9] = new Employee("Asranomov G.A. ", 3, 85_000);

        System.out.println(employees[0]);
        System.out.println(employees[1]);

        employees[0].setDepartment(3);
        employees[1].setSalary(100_000);

        System.out.println(employees[0]);
        System.out.println(employees[1]);

        System.out.println("Ф.И.О. " + employees[1].getFullName());
        System.out.println();
        printList(employees);
        System.out.println();
        sumSalary(employees);
        System.out.println();
        minSalary(employees);
        System.out.println();
        maxSalary(employees);
        System.out.println();
        average(employees);
        System.out.println();
        nameEmployees(employees);
        System.out.println();

    }
    public static void sumSalary(Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату: " + sum + " рублей.");
    }
    public static void minSalary (Employee[] employees) {
        String name = null;
        double minSalary = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    name = employee.getFullName();
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой " + name + "его зарплата " + minSalary + " рублей.");
    }
    public static void maxSalary (Employee[] employees) {
        String name = null;
        double maxSalary = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    name = employee.getFullName();
                }
            }
        }
        System.out.println("Сотрудник с самой большой зарплатой " + name + "его зарплата " + maxSalary + " рублей.");
    }
    public static void average (Employee[] employees) {
        int sumAverage = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sumAverage += employee.getSalary() / 10;
            }
        }
        System.out.println("Среднее значение зарплат: " + sumAverage + " рублей.");
    }
    public static void nameEmployees (Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
    private static void printList(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.printf("Ф.И.О. %15s   |  Отдел %s   |    Зарплата %s %n", employee.getFullName(),
                        employee.getDepartment(), employee.getSalary());

            }
        }
    }
}