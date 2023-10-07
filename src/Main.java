public class Main {

    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        int i = 0;
        employees[i] = new Employee("Комиссаров Абрам Ростиславович", 3, 64000);
        i++;
        employees[i] = new Employee("Николаев Адриан Миронович", 1, 51000);
        i++;
        employees[i] = new Employee("Воронова Мила Семёновна", 2, 72000);
        i++;
        employees[i] = new Employee("Щукина Тамара Яковлевна", 5, 95000);
        i++;
        employees[i] = new Employee("Казаков Виссарион Германович", 4, 78000);
        i++;
        employees[i] = new Employee("Евдокимова Нонна Альбертовна", 4, 67000);
        i++;
        employees[i] = new Employee("Титов Виссарион Глебович", 1, 63000);;
        i++;
        employees[i] = new Employee("Силина Иветта Даниловна", 3, 75000);
        i++;
        employees[i] = new Employee("Зыкова Эдуарда Аркадьевна", 2, 83000);
        i++;
        employees[i] = new Employee("Шаров Петр Христофорович", 5, 91000);

        //вывод списка сотрудников
        printAllEmployees();

        System.out.println("Сумма затрат на зарплаты в месяц: " + countAllSalary());

        System.out.println("Сотрудник с минимальной зарплатой: " + minimumSalary());

        System.out.println("Сотрудник с максимальной зарплатой: " + maximumSalary());

        System.out.println("Среднее значение зарплат: " + averageSalary());

        //ФИО всех сотрудников
        allFIO();
    }

    public static float countAllSalary() { //сумма затрат на зарплаты
        float allSalary = 0;
        for (Employee employee : employees) {
            allSalary = allSalary + employee.getSalary();
        }
        return allSalary;
    }

    public static Employee minimumSalary() { //минимальная зарплата
        float min = Float.MAX_VALUE;
        Employee employee = null;
        for (Employee value : employees) {
            if (value.getSalary() < min) {
                min = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public static Employee maximumSalary() { //максимальная зарплата
        float max = Float.MIN_VALUE;
        Employee employee = null;
        for (Employee value : employees) {
            if (value.getSalary() > max) {
                max = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public static float averageSalary() { //средняя зарплата
        float average = 0;
        average = countAllSalary() / employees.length;
        return average;
    }

    public static void allFIO() { //вывод всех ФИО
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public static void printAllEmployees () { //вывод списка сотрудников
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
