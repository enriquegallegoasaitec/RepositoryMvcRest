package es.engalma.springmvcrestful.dao;

import es.engalma.springmvcrestful.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class EmployeeDAO {

    private static final Map<String, Employee> empMap = new HashMap<String, Employee>();

    static {
        initEmps();
    }

    private static void initEmps() {

        System.out.println("funcion initEmps");
        Employee emp1 = new Employee("E01", "Smith", "Clerk");
        Employee emp2 = new Employee("E02", "Allen", "Salesman");
        Employee emp3 = new Employee("E03", "Jones", "Manager");
        Employee emp4 = new Employee("E04", "Ana",   "Nurse");
        Employee emp5 = new Employee("E05", "Rosa",  "Teacher");



        empMap.put(emp1.getEmpNo(), emp1);
        empMap.put(emp2.getEmpNo(), emp2);
        empMap.put(emp3.getEmpNo(), emp3);
        empMap.put(emp4.getEmpNo(), emp4);
        empMap.put(emp5.getEmpNo(), emp5);
    }

    public Employee getEmployee(String empNo) {
        System.out.println("funcion getEmployee");
        return empMap.get(empNo);
    }

    public Employee addEmployee(Employee emp) {
        System.out.println("funcion addEmployee");
        empMap.put(emp.getEmpNo(), emp);
        return emp;
    }

    public Employee updateEmployee(Employee emp) {
        System.out.println("funcion updateEmployee");
        empMap.put(emp.getEmpNo(), emp);
        return emp;
    }

    public void deleteEmployee(String empNo) {

        System.out.println("funcion deleteEmployee");
        empMap.remove(empNo);
    }

    public List<Employee> getAllEmployees() {

        System.out.println("funcion getAllEmployee");
        Collection<Employee> c = empMap.values();
        List<Employee> list = new ArrayList<Employee>();
        list.addAll(c);
        return list;
    }

}
