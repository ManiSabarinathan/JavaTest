import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String ... args) {
        EmployeeComparator empComparator = new EmployeeComparator();
        PriorityQueue<Employee> queue = new PriorityQueue<>(5, empComparator);
        queue.add(new Employee("juju",100000L));
        queue.add(new Employee("sabari",5000L));
        queue.add(new Employee("small juju",8000L));
        queue.add(new Employee("papu",9000L));

        System.out.println("Before size:: " + queue.size());
        System.out.println("Min salary ==> "+ queue.poll());
        System.out.println("After size:: " + queue.size());
    }
}
class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return (int)e1.salary - (int)e2.salary;
    }


}
class Employee {
    public Employee(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    String name;
    long salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}