public class Tester3 {
    public static void main(String[] args) {
        PermanentEmployee permaEmpl = new PermanentEmployee("Dedik", 500);
        InternshipEmployee internEmpl = new InternshipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");

        Employee e[] = {permaEmpl, internEmpl};
        Payable p[] = {permaEmpl, eBill};
        Employee e2[] = {permaEmpl, internEmpl, eBill};
    }
}
