package TreeSet;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }

    // 规则：Java规则
    // 如果程序员认为比较者大于被比较者 返回正数！
    // 如果程序员认为比较者小于被比较者 返回负数！
    // 如果程序员认为比较者等于被比较者 返回0！
    // 升序排列
    @Override
    public int compareTo(Employee o) {
/*
        if(this.salary>o.salary){
            return 1;
        }else if (this.salary==o.salary){
            return 0;
        }else return -1;
        */
        //compare() : Comparator 接口中定义的方法，具体实现时可调用compareTo() 方法。
        //返回值 0 表示相同，负数表示排在前，正数表示排在后。
        return Double.compare(this.salary, o.salary);     //比较两个指定的 double 值
    }
}
