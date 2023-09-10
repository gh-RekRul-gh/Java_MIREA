package ru.mirea.it.ivbo;

import java.util.Formatter;

public class Report {
    public static void generateReport(Employee[] employees) {
        Formatter formatter = new Formatter();
        for (Employee employee : employees) {
            formatter.format("%s has salary %155.2f%n", employee.getFullName(), employee.getSalary());
        }
        System.out.println(formatter);
    }
}
