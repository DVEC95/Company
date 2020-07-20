package staff;

public abstract class Employee {

    private String name;
    private int numberNI;
    private double salary;

    public Employee(String name, int numberNI, double salary) {
        this.name = name;
        this.numberNI = numberNI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals("")){
            this.name = name;
        } else {
            this.name = this.name;
        }
    }

    public int getNumberNI() {
        return numberNI;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double raise){
        double raiseAmount = 0;
        if (raise > 0){
            raiseAmount = salary + (salary * raise);
        }
        return raiseAmount;
    }

    public double payBonus(){
        return salary / 100;
    }

}
