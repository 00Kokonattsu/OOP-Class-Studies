public class Tester {
    public static void main(String[] args) throws Exception {
        PermanentEmployee permaEmpl = new PermanentEmployee("Dedik", 500);

        Employee e;
        
        e = permaEmpl;
        
        System.out.println("" + e.getEmployeeInfo());
        System.out.println("====================");
        System.out.println("" + permaEmpl.getEmployeeInfo());
    }
}
