package staff;

public abstract class Employee {

    private String name;
    private String NI;
    private Double salary;

    public Employee(String name, String NI, Double salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void changeName(String newName) {
        if (newName != null) {
            this.name = newName;
        }
    }

    public String getNI() {
        return this.NI;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void raiseSalary(Double increase) {
        if (increase > 0) {
            this.salary = this.salary * increase;
        }
    }

    public Double payBonus() {
        return this.salary * 0.01;
    }
}