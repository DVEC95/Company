package management;

public class Director extends Manager{

    private double budget;

    public Director(String name, int numberNI, double salary, String deptName, double budget) {
        super(name, numberNI, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus(){
        return getSalary() / 50;
    }

}
