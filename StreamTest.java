import java.util.*;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String ... args) {
        Employee e1 = new Employee("juju",25, 1001L,"Active");
        Employee e2 = new Employee("small juju",15, 1001L,"Active");
        Employee e3 = new Employee("papu",30, 1001L,"Active");
        Employee e4 = new Employee("saba",35, 1004L,"Active");
        Employee e5 = new Employee("temp",120, 1005L,"InActive");

        StreamTest t1 = new StreamTest();
        List empList = new ArrayList();
        empList.add(e1);empList.add(e2);empList.add(e3);empList.add(e4);empList.add(e5);
        t1.findActiveInactiveEmployee(empList);
        t1.findMinMaxAgeEmployee(empList);
        t1.findMinMaxAgeEmployeeByDeptId(empList);
    }

    public void findActiveInactiveEmployee(List<Employee> empList) {
        //Find the active and inactive employee
        List<Employee> activeList = empList.stream().filter(e -> e.getStatus().equalsIgnoreCase("InActive")).collect(Collectors.toList());
        System.out.println(activeList);

        Long activeEmpCount = empList.stream().filter(emp -> emp.getStatus().equalsIgnoreCase("Active")).count();
        Long inActiveEmpCount = empList.stream().filter(emp -> emp.getStatus().equalsIgnoreCase("InActive")).count();
        System.out.println("Active count :: " + activeEmpCount);
        System.out.println("InActive count :: " + inActiveEmpCount);
    }

    public void findMinMaxAgeEmployee(List<Employee> empList) {
        Optional<Employee> empWithMaxAge = empList.stream().max(Comparator.comparing(Employee::getAge));
        Optional<Employee> empWithMinAge = empList.stream().min(Comparator.comparing(Employee::getAge));
        System.out.println("Max Age employee:: " + empWithMaxAge);
        System.out.println("Min Age employee:: " + empWithMinAge);
    }

    public void findMinMaxAgeEmployeeByDeptId(List<Employee> empList) {
        Map<Long, Optional<Employee>> empAgeByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId,Collectors.maxBy(Comparator.comparing(Employee::getAge))));
        System.out.println("Employee Age by dept :: "+ empAgeByDept);
    }
}


class Employee {
    String name;
    Integer age;
    Long deptId;
    String status;

    public Employee(String name, Integer age, Long deptId, String status) {
        this.name = name;
        this.age = age;
        this.deptId = deptId;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", deptId=" + deptId +
                ", status='" + status + '\'' +
                '}';
    }
}