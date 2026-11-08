public class Tester1 {
    public static void main(String[] args) throws Exception {
        PermanentEmployee permaEmpl = new PermanentEmployee("Dedik", 500);
        InternshipEmployee internEmpl = new InternshipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");

        Employee e;
        Payable p;
        e = permaEmpl;
        e = internEmpl;
        p = permaEmpl;
        p = eBill;
    }
}
