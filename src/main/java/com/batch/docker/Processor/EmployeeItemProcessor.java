package com.batch.docker.Processor;

import com.batch.docker.domain.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class EmployeeItemProcessor implements ItemProcessor<Employee, Employee> {
    private static final Logger log = LoggerFactory.getLogger(EmployeeItemProcessor.class);

    @Override
    public Employee process(final Employee employee) throws Exception {
        final String firstName = employee.getFirstName().toUpperCase();
        final String lastName = employee.getLastName().toUpperCase();

        final Employee transformedEmployee = new Employee();
        transformedEmployee.setFirstName(firstName);
        transformedEmployee.setLastName(lastName);

        log.info("Converting (" + employee + ") into (" + transformedEmployee + ")");
        return transformedEmployee;
    }
}