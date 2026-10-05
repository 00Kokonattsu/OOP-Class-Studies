public class Manager extends Employee {
    public int allowance;

    public Manager() {

    }

    public void showManagerData() {
        super.showEmployeeData();
        System.out.println("Allowance: " + allowance);
        System.out.println("Total Salary: " + (super.salary+allowance));
    }
}
