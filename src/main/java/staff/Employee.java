package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    public double salary;

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
        if (raiseBy > 0 ) {
            return this.salary + raiseBy;
        }
        return this.salary;
    }

    public double payBonus(){
        double bonus = (this.salary / 100 * 1);
        return bonus;
    }

    public String setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            return "You must enter a valid name!";
        }
        return this.name;
    }
}
