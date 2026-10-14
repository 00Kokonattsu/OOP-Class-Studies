public class Manager extends Employee {
    private double allowance;
    private String department;
    private Staff st[];

    public void setAllowance (int allowance) {
        this.allowance = allowance;
    }

    public double getAllowance () {
        return allowance;
    }

    public void setDepartment (String department) {
        this.department = department;
    }

    public String getDepartment () {
        return department;
    }

    public void setStaff(Staff st[]) {
        this.st = st;
    }

    public void viewStaff () {
        System.out.println("--------------------");
        for (int i = 0; i < st.length; i++) {
            st[i].lihatInfo();
        }
        System.out.println("--------------------");
    }

    public double getSalary () {
        return super.getSalary() + allowance;
    }

    public void lihatInfo() {
        System.out.println("Manager: " + department);
        System.out.println("Employee ID: " + this.getEmployeeId());
        System.out.println("Name: " + this.getName());
        System.out.println("Group: " + this.getGroup());
        // System.out.println("Overtime amount: " + this.getOvertime());
        System.out.printf("Allowance: %.0f\n", this.getAllowance());
        System.out.printf("Salary: %.0f\n", this.getSalary());
    }
}
