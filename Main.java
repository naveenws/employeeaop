
package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Appconfig.class);

        EmployeeService service = context.getBean(EmployeeService.class);

        service.addEmployee();
        System.out.println();
        service.displayEmployee();
        System.out.println();
        service.calculateSalary();

        context.close();
    }
}
