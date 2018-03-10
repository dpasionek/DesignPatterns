package Composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Employee> inChargeOf;

    public Employee(String name) {
        this.name = name;
        inChargeOf = new ArrayList<Employee>();
    }

    public void addSubordinate(Employee e) {
        inChargeOf.add(e);
    }

    public void removeSubordinate(Employee e) {
        inChargeOf.remove(e);
    }

    public List<Employee> getInChargeOf() {
        return inChargeOf;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return this.getName();
    }
}
