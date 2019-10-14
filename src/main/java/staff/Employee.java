package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNiNumber() {
        return this.niNumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public double raiseSalary(double raiseBy){
        return this.salary + raiseBy;
    }

    public double payBonus(){
        double bonus = (this.salary / 100 * 1);
        return bonus;
    }
}
