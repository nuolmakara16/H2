import java.util.*;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Collection<StaffMember> collection = new ArrayList<StaffMember>();
        Scanner scanner = new Scanner(System.in);
        main.displayMainMenu(scanner, collection);
    }

    private void displayMainMenu(Scanner scanner, Collection<StaffMember> collection) {
        int choice = 0;
        System.out.println("Welcome to main menu!");
        do {
            System.out.println("========== Staff Member ==========");
            System.out.println("1.Insert Employee");
            System.out.println("2.Display Employee");
            System.out.println("3.Update Employee");
            System.out.println("4.Remove Employee");
            System.out.println("5.Exit");
            System.out.println("Please choose your options: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> { insertEmployee(scanner, collection); }
                case 2 -> { displayEmployee(collection); }
                case 3 -> { updateEmployee(scanner, collection); }
                case 4 -> { deleteEmployee(scanner, collection); }
                default -> { System.out.println("Incorrect option! \n"); }
            }
        } while(choice != 5);
    }

    private void displayCreateEmployeeMenu (Scanner scanner, Collection<StaffMember> collection) {
        int choice = 0;
        do {
            System.out.println("============= Insert Employee =================");
            System.out.println("[1]. Volunteer");
            System.out.println("[2]. SalariedEmployee");
            System.out.println("[3]. HourlyEmployee");
            System.out.println("[4]. Back");
            System.out.println("Please choose your options: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> { insertVolunteer(scanner, collection); }
                case 2 -> { insertSalariedEmployee(scanner, collection); }
                case 3 -> { insertHourlyEmployee(scanner, collection); }
                default -> { System.out.println("Incorrect option! \n"); }

            }
        } while(choice != 4);
    }

    private void insertEmployee(Scanner scanner, Collection<StaffMember> collection) {
        displayCreateEmployeeMenu(scanner, collection);
    }

    private void displayEmployee(Collection<StaffMember> collection) {
        if(collection.isEmpty()) {
            System.out.println("There is no data in the record currently! \n");
        } else {
            System.out.println("============== Staff List ===============");
            for(StaffMember staff: collection) {
                System.out.println(staff);
            }
            System.out.println("========================================= \n");
        }

    }

    private void updateEmployee(Scanner scanner, Collection<StaffMember> collection) {
        boolean found = false;
        System.out.println("Please enter employee ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (StaffMember staff : collection) {
            if(staff.getEmployeeId() == id) {
                found = true;
                System.out.println("User found");
                // ============ Update logic here =================

                // ================================================
            }
        }
        if (!found) {
            System.out.println("No User Found!");
        }

    }

    private void deleteEmployee(Scanner scanner, Collection<StaffMember> collection) {
        boolean found = false;
        System.out.println("Please enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        try {
            collection.removeIf(col -> col.id == id);
            System.out.println("User deleted!");
        } catch(Exception e) {
           System.out.println("No user found!");
        }
    }

    private void insertVolunteer(Scanner scanner, Collection<StaffMember> collection) {
        System.out.println("Volunteer name: ");
        String name = scanner.nextLine();
        System.out.println("Volunteer address: ");
        String address = scanner.nextLine();
        System.out.println("Volunteer salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        collection.add(new Volunteer(name, address, salary));
//        displayEmployee(collection);
    }

    private void insertSalariedEmployee(Scanner scanner, Collection<StaffMember> collection) {
        System.out.println("Employee name: ");
        String name = scanner.nextLine();
        System.out.println("Employee address: ");
        String address = scanner.nextLine();
        System.out.println("Employee salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Employee bonus: ");
        double bonus = scanner.nextDouble();
        scanner.nextLine();

        collection.add(new SalariedEmployee(name, address, salary, bonus));
//        displayEmployee(collection);
    }
    private void insertHourlyEmployee(Scanner scanner, Collection<StaffMember> collection) {
        System.out.println("Employee name: ");
        String name = scanner.nextLine();
        System.out.println("Employee address: ");
        String address = scanner.nextLine();
        System.out.println("Employee worked hour: ");
        int hourWorked = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Employee rate: ");
        double rate = scanner.nextDouble();
        scanner.nextLine();

        collection.add(new HourlySalaryEmployee(name, address, hourWorked, rate));
//        displayEmployee(collection);
    }
}