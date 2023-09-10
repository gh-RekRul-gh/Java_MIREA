package ru.mirea.it.ivbo;

import java.util.Random;

public class StringFormatting {
    public static void main(String[] args) {
        Random random = new Random();
        int randomSize = random.nextInt(7) + 3;
        Employee[] employees = new Employee[randomSize];
        for (int i = 0; i < randomSize; ++i) {
            Employee newEmployee = new Employee("employee" + i, Math.random() * 50000 + 50000);
            employees[i] = newEmployee;
        }
        Report.generateReport(employees);
    }
}
