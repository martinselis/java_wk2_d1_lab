package management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String NI, Double salary, String deptName) {
        super(name, NI, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return this.deptName;
    }
}
