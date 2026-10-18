public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Program Testing Class Manager & Staff");
        Manager man[] = new Manager[2];
        Staff staff1[] = new Staff[2];
        Staff staff2[] = new Staff[3];

        man[0] = new Manager();
        man[0].setName ("Tedjo");
        man[0].setEmployeeId("101");
        man[0].setGroup ("1");
        man[0].setAllowance (5000000);
        man[0].setDepartment ("Administrasi");

        man[1] = new Manager();
        man[1].setName ("Atika");
        man[1].setEmployeeId ("102");
        man[1].setGroup ("1");
        man[1].setAllowance (2500000);
        man[1].setDepartment ("Pemasaran");

        staff1[0] = new Staff();
        staff1[0].setName ("Usman");
        staff1[0].setEmployeeId ("0003");
        staff1[0].setGroup ("2");
        staff1[0].setOvertime (10);
        staff1[0].setOvertimeSalary (10000);

        staff1[1] = new Staff();
        staff1[1].setName ("Anugrah");
        staff1[1].setEmployeeId ("0005");
        staff1[1].setGroup ("2");
        staff1[1].setOvertime (10);
        staff1[1].setOvertimeSalary(55000);
        man[0].setStaff(staff1);

        staff2[0]=new Staff();
        staff2[0].setName ("Hendra");
        staff2[0].setEmployeeId ("0004");
        staff2[0].setGroup ("3");
        staff2[0].setOvertime (15);
        staff2[0].setOvertimeSalary (5500);

        staff2[1] = new Staff();
        staff2[1].setName("Arie");
        staff2[1].setEmployeeId("0006");
        staff2[1].setGroup("4");
        staff2[1].setOvertime(5);
        staff2[1].setOvertimeSalary(100000);

        staff2[2] = new Staff();
        staff2[2].setName("Mentari");
        staff2[2].setEmployeeId("0007");
        staff2[2].setGroup("3");
        staff2[2].setOvertime(6);
        staff2[2].setOvertimeSalary(20000);
        man[1].setStaff(staff2);

        man[0].lihatInfo();
        man[1].lihatInfo();
    }
}
