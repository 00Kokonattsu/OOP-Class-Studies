public class PermanentStaff extends Staff {
    public String group;
    public int insurance;

    public PermanentStaff() {

    }

    public PermanentStaff(String name, String address, String gender, int age, int salary, int overtime, int deduction, String group, int insurance) {
        super(name, address, gender, age, salary, overtime, deduction);
        this.group = group;
        this.insurance = insurance;
    }

    public void showPermanentStaff() {
        System.out.println("======Permanent Staff Data======");
        super.showStaffData();
        System.out.println("Group: " + group);
        System.out.println("Total Insurance: " + insurance);
        System.out.println("Net Salary: " + (salary + overtime - deduction - insurance));
    }
}
