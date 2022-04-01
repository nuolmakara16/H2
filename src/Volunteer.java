public class Volunteer  extends  StaffMember {
    private final double salary;
    Volunteer(String name, String address, double salary) {
        super(name, address);
        this.salary = salary;
    }

    public double getVolunteerSalary() { return salary; }
    public String toString() {
        return "Volunteer \n"
                + "ID : " + id + "\n"
                + "Name : " + name + "\n"
                + "Address : " + address + "\n"
                + "Salary : " + salary + "\n"
                + "---------------------------"
                ;
    }
}
