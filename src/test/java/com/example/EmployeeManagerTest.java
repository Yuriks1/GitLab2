package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

class EmployeeManagerTest {

    EmployeeRepository employeeRepository = new EmployeeRepositoryStub(List.of(

            new Employee("1", 10000)));

    BankService bankService = mock(BankService.class);
    EmployeeManager employeeManager = new EmployeeManager(employeeRepository, bankService);

    @Test
    void testIfThrowsExceptionWhenEmpty() {

        doThrow(new RuntimeException()).when(bankService).pay(anyString(), anyDouble());

        employeeManager.payEmployees();

        assertThat(employeeRepository.findAll().get(0).isPaid()).isFalse();

    }

    @Test
    void testIfEmployeeIsPaid() {

        EmployeeRepository employeeRepository = mock(EmployeeRepository.class);

        BankService bankService = mock(BankService.class);

        Employee employee1 = new Employee(anyString(), 20000);

        assertThat(employee1.isPaid());

    }
}