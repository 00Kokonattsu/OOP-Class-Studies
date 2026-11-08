public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner ();
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        ow.pay(eBill);
        System.out.println("------------------");

        PermanentEmployee permaEmpl = new PermanentEmployee("Dedik", 500);
        ow.pay(permaEmpl);
        System.out.println("------------------");

        InternshipEmployee internEmpl = new InternshipEmployee("Sunarto", 5);
        ow.showMyEmployee(permaEmpl);
        System.out.println("------------------");
        ow.showMyEmployee(internEmpl);
    }
}
