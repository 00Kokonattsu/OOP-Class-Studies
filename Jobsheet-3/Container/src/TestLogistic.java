import java.util.Scanner;
public class TestLogistic {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Container kontainerAlfa = new Container("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Name of the Container's Owner: " + kontainerAlfa.getOwnerName());
        System.out.println("Maximum Capacity: " + kontainerAlfa.getMaximumCapacity());

        System.out.println("\nAdding new load weighing 6.000 kg...");
        kontainerAlfa.addLoad(scan.nextInt());
        System.out.println("Current capacity: " + kontainerAlfa.getCurrectCapacity());

        System.out.println("\nAdding new load weighing 4.000 kg...");
        kontainerAlfa.addLoad(scan.nextInt());
        System.out.println("Current capacity: " + kontainerAlfa.getCurrectCapacity());

        System.out.println("\nUnloading cargo weighing 500 kg...");
        kontainerAlfa.unload(scan.nextInt());
        System.out.println("Current capacity: " + kontainerAlfa.getCurrectCapacity());

        System.out.println("\nUnloading cargo weighing 1.500 kg...");
        kontainerAlfa.unload(scan.nextInt());
        System.out.println("Current capacity: " + kontainerAlfa.getCurrectCapacity());
        scan.close();
    }
}
