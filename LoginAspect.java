
package com.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {

    @Before("execution(* com.example.EmployeeService.*(..))")
    public void logBeforeMethod() {
        
    }

    @Before("execution(* com.example.EmployeeService.addEmployee(..))")
    public void logBeforeAddEmployee() {
        System.out.println("Logging: Adding employee");
    }

    @Before("execution(* com.example.EmployeeService.displayEmployee(..))")
    public void logBeforeDisplayEmployee() {
        System.out.println("Logging: Displaying employee");
    }

    @Before("execution(* com.example.EmployeeService.calculateSalary(..))")
    public void logBeforeCalculateSalary() {
        System.out.println("Logging: Calculating salary");
    }
}
