package com.company;

public class Main {

    private static Employee[] employees = new Employee[10];

    public static void printEmployees(){
        for(Employee employee : employees){
            System.out.println((employee));
        }
    }

    public static int calculateTotalSalary(){
        int sum = 0;
        for (Employee employee : employees){
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary){
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary){
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float calculateAverageSalary() {
        return calculateTotalSalary() / (float) employees.length;
    }

    public static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    public static void main(String[] args) {
        employees = new Employee[]{
                new Employee("Федоров Егор Дмитревич", 50000, 1),
                new Employee("Алексеев Леонид Семенович", 55000, 1),
                new Employee("Казаков Сергей Андреевич", 75000, 1),
                new Employee("Андеев Алексей Алексеевич", 70000,2),
                new Employee("Иванова Ксения Федорова", 60000,2),
                new Employee("Анфалова Ольга Игоревна", 45000,2),
                new Employee("Копанев Юрий Сергеевич", 80000, 3),
                new Employee("Новопашенцев Илья Владимирович", 65000,3),
                new Employee("Панов Павел Александрович", 75000,3),
                new Employee("Чернов Юрий Алексеевич", 70000,3)
        };
        printFullNames();
        printEmployees();
    }
}
