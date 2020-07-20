package management;

import staff.Employee;

public class Manager extends Employee{

    private String deptName;

    public Manager(String name, int numberNI, double salary, String deptName) {
        super(name, numberNI, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

}
