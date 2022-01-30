package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class EmployeeTest {

    Employee employee = new Employee("1", 10000);

    @Test
    void testThatIdShouldReturnTwo() {

        employee.setId("2");
        var result = employee.getId();
        assertThat(result).isEqualTo("2");
    }

    @Test
    void testThatEmployeeReturnCorrectName(){
        employee.setId("Martin");
        var result = employee.getId();
        assertThat(result).isEqualTo("Martin");
    }


    @Test
    void testThatSalaryShouldReturnTwentyThousand() {

        employee.setSalary(20000.00);
        double result = (employee.getSalary());
        assertThat(result).isEqualTo(20000.0);
    }

    @Test
    void testToStringMethod() {

        var result = employee.toString();
        assertThat(result).isEqualTo("Employee [id=1, salary=10000.0]");
    }

    @Test
    void testToGetSalaryForEmployee() {

        var result = employee.getSalary();
        assertThat(result).isEqualTo(10000);

    }

    @Test
    void testToCheckIfEmployeeBeingPaid() {

        boolean result = employee.isPaid();
        assertThat(result).isFalse();
    }

    @Test
    void testIfUpdatedWhenSetPaidIsCalled() {

        employee.setPaid(true);
        var result = employee.isPaid();
        assertThat(result).isTrue();
    }
}
