public class StaffMember {
    private static int nextId = 1;

    protected int id;
    protected String name;
    protected String address;

    StaffMember(String name, String address) {
        this.id = StaffMember.nextId;
        this.name = name;
        this.address = address;

        StaffMember.nextId++;
    }

    public int getEmployeeId() { return id; }
    public String getEmployeeName() { return name; }
    public String getEmployeeAddress() { return address; }

    public String toString() {
        return "Employee \n"
                + "ID:" + id + "\n"
                + "Name: " + name + "\n"
                + "Address: " + address + "\n"
                + "---------------------------"
                ;
    }
    public Double pay() {
        return 1.0;
    }
}
