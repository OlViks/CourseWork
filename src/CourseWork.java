public class CourseWork {

    public static void main(String[] args) {
        System.out.println("Course Work!");
        System.out.println();

        Employee petov = new Employee("Petov U.A. ", 1, 35_000);
        Employee ivanov = new Employee("Ivanov T.A. ", 2, 135_000);
        Employee mironov = new Employee("Mironov A.S. ", 3, 75_000);
        Employee saltkov = new Employee("Saltkov B.A. ", 5, 95_000);
        Employee merkon = new Employee("Merkon I.I. ", 5, 50_000);
        Employee gerasimov = new Employee("Gerasimov T.T. ", 2, 150_000);
        Employee satirov = new Employee("Satirov J.A. ", 1, 200_000);
        Employee tronov = new Employee("Tronov K.T. ", 3, 45_000);
        Employee sergeev = new Employee("Sergeev H.A. ", 1, 65_000);
        Employee asranomov = new Employee("Asranomov G.A. ", 3, 80_000);

        System.out.println(petov);
        System.out.println(ivanov);

        petov.setDepartment(3);
        ivanov.setSalary(100_000);

        System.out.println(petov);
        System.out.println(ivanov);

        System.out.println("Ф.И.О. " + ivanov.getFullName());
        System.out.println();



        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Petov U.A. ", 1, 35_000);
        employees[1] = new Employee("Ivanov T.A. ", 2, 135_000);
        employees[2] = new Employee("Mironov A.S. ", 3, 75_000);
        employees[3] = new Employee("Saltkov B.A. ", 5, 95_000);
        employees[4] = new Employee("Merkon I.I. ", 5, 50_000);
        employees[5] = new Employee("Gerasimov T.T. ", 2, 150_000);
        employees[6] = new Employee("Satirov J.A. ", 1, 200_000);
        employees[7] = new Employee("Tronov K.T. ", 3, 45_000);
        employees[8] = new Employee("Sergeev H.A. ", 4, 5_000);
        employees[9] = new Employee("Asranomov G.A. ", 3, 85_000);
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
        int sum  = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплату: " + sum + " рублей.");
    }
    public static void minSalary (Employee[] employees) {
        String name = employees[0].getFullName();
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                name = employee.getFullName();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой " + name + " его зарплата " + minSalary + " рублей.");
    }

    public static void maxSalary (Employee[] employees) {
        String name = employees[0].getFullName();
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                name = employee.getFullName();
            }
        }
        System.out.println("Сотрудник с самой большой зарплатой " + name + " его зарплата " + maxSalary + " рублей.");
    }
    public static void average (Employee[] employees) {
        int sumAverage  = 0;
        for (Employee employee : employees) {
            sumAverage += employee.getSalary() / 2;
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
