public class HourlySalaryEmployee extends StaffMember {
    private final int hourWorked;
    private final double rate;

    HourlySalaryEmployee(String name, String address, int hourWorked, double rate) {
        super(name, address);
        this.hourWorked = hourWorked;
        this.rate = rate;
    }
    public int getHourlySalaryEmployeeHourWorked() { return hourWorked; }
    public double getHourlySalaryEmployeeRate() { return rate; }

    public String toString() {
        return "HourlySalaryEmployee \n"
                + "ID:" + id + "\n"
                + "Name: " + name + "\n"
                + "Address: " + address + "\n"
                + "Hour Worked: " + hourWorked + "\n"
                + "Rate: " + rate + "\n"
                + "---------------------------"
                ;
    }
}
