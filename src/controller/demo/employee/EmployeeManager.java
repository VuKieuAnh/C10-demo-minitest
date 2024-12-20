package controller.demo.employee;

import model.Employee;

import java.util.Collections;
import java.util.List;

public class EmployeeManager implements IEmployeeManager {
    @Override
    public List<Employee> getAll() {
        return Collections.emptyList();
    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public void remove(Employee employee) {

    }

    @Override
    public Employee findById(int id) {
        return null;
    }
}
