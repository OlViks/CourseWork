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

        System.out.println(petov.toString());
        System.out.println(ivanov.toString());

        petov.setDepartment(3);
        ivanov.setSalary(100_000);

        System.out.println(petov.toString());
        System.out.println(ivanov.toString());

        System.out.println("Ф.И.О. " + ivanov.getFullName());
        System.out.println();



        Employee[] Employees = new Employee[10];
        Employees[0] = new Employee("Petov U.A. ", 1, 35_000);
        Employees[1] = new Employee("Ivanov T.A. ", 2, 135_000);
        Employees[2] = new Employee("Mironov A.S. ", 3, 75_000);
        Employees[3] = new Employee("Saltkov B.A. ", 5, 95_000);
        Employees[4] = new Employee("Merkon I.I. ", 5, 50_000);
        Employees[5] = new Employee("Gerasimov T.T. ", 2, 150_000);
        Employees[6] = new Employee("Satirov J.A. ", 1, 200_000);
        Employees[7] = new Employee("Tronov K.T. ", 3, 45_000);
        Employees[8] = new Employee("Sergeev H.A. ", 1, 65_000);
        Employees[9] = new Employee("Asranomov G.A. ", 3, 80_000);
        printList(Employees);
        System.out.println();
        sumSalary(Employees);
        minSalary(Employees);

    }
        private static void printList(Employee[] Employees) {
            for (Employee Employee : Employees) {
                if (Employee != null) {
                    System.out.printf("Ф.И.О. %15s   |  Отдел %s   |    Зарплата %s %n", Employee.getFullName(),
                            Employee.getDepartment(), Employee.getSalary());

                }

            }
    }
    private static void sumSalary(Employee[] Employees) {
        double sum  = 0;
        for (Employee Employee : Employees) {
            sum += Employee.getSalary();
            System.out.println(sum);
        }
    }
    private static void minSalary(Employee[] Employees) {
        double min = Integer.MAX_VALUE;
        for (Employee Employee : Employees){
            if (Employee.getSalary() < min) {
                min = Employee.getSalary();
                System.out.println(min);

            }
        }


    }
    private static void maxSalary(Employee[] Employees) {
        double max = Integer.MIN_VALUE;

    }

}
