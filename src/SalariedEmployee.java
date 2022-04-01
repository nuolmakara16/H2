public class SalariedEmployee extends  StaffMember {
    private final double salary;
    private final double bonus;

    SalariedEmployee(String name, String address, double salary, double bonus) {
        super(name, address);
        this.salary = salary;
        this.bonus = bonus;
    }
    public double getSalariedEmployeeSalary () { return salary; }
    public double getSalariedEmployeeBonus () { return bonus; }
    public String toString() {
        return "SalariedEmployee \n"
                + "ID:" + id + "\n"
                + "Name: " + name + "\n"
                + "Address: " + address + "\n"
                + "Salary: " + salary + "\n"
                + "Bonus: " + bonus + "\n"
                + "---------------------------"
                ;
    }
}
