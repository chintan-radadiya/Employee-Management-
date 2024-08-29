import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        while (true) {

            menu.mainMenu();
            int choiceFromMenu = sc.nextInt();

            switch (choiceFromMenu) {

                case 1:
                    System.out.println("You have choose to add record.");

                    System.out.print("Enter Id for employee:");
                    int id = sc.nextInt();
                    System.out.print("Enter Name for employee:");
                    String name = sc.next();

                    System.out.print("Enter Salary of employee:");
                    int salary = sc.nextInt();

                    System.out.print("Enter age of employee:");
                    int age = sc.nextInt();

                    System.out.print("Enter City of employee:");
                    String city = sc.next();

                    Employee e = new Employee(id, name, salary, age, city);
                    list.add(e);
                    System.out.println("Record added successfully.");
                    break;

                case 2:

                    if (list.isEmpty()) {
                        System.out.println("No record found!!");
                    } else {
                        System.out.print("Enter id of employee:");
                        int choiceId = sc.nextInt();

                        boolean found = false;
                        for (Employee e1 : list) {
                            if (choiceId == e1.id) {
                                found = true;
                                System.out.println(e1.id);
                                System.out.println(e1.name);
                                System.out.println(e1.age);
                                System.out.println(e1.salary);
                                System.out.println(e1.city);
                            }
                            if (!found) {
                                System.out.println("Invalid ID!!!");
                            }
                        }
                    }
                    break;

                case 3:
                    if (list.isEmpty()) {
                        System.out.println("There is no record !!");
                    } else {
                        for (Employee e3 : list) {
                            System.out.println(e3.id);
                            System.out.println(e3.name);
                            System.out.println(e3.age);
                            System.out.println(e3.salary);
                            System.out.println(e3.city);
                        }
                    }
                    break;

                case 4:
                    if (list.isEmpty()) {
                        System.out.println("No data Available");
                    }

                    System.out.println("Enter Id to update:");
                    int choiceid2 = sc.nextInt();

                    boolean found = false;

                    for (Employee e2 : list) {
                        if (e2.id == choiceid2) {

                            System.out.print("Enter Id for employee:");
                            e2.id = sc.nextInt();

                            System.out.print("Enter Name for employee:");
                            e2.name = sc.next();

                            System.out.print("Enter Salary of employee:");
                            e2.salary = sc.nextInt();

                            System.out.print("Enter age of employee:");
                            e2.age = sc.nextInt();

                            System.out.print("Enter City of employee:");
                            e2.city = sc.next();

                            System.out.println("Record Updated successfully!!!");
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Id not found!!");
                    }
                    break;

                case 5:

                    if (list.isEmpty()) {
                        System.out.println("No data Available");
                    } else {
                        System.out.println("Enter Id to delete:");
                        int choiceid3 = sc.nextInt();

                        boolean isfound = false;

                        for (Employee e4 : list) {
                            if (choiceid3 == e4.id) {
                                isfound = true;
                                list.remove(e4);
                            }
                        }
                        if (!isfound) {
                            System.out.println("Employee not found!!!");
                        }
                    }
                    break;

                case 6:
                    System.exit(1);
                    break;

                default:
                    System.out.println("Enter valid choice!!!");
            }
        }
    }
}
