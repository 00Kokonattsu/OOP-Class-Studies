public class Staff extends Employee {
    private int overtime;
    private double overtimeSalary;

    public void setOvertime (int overtime) {
        this.overtime = overtime;
    }

    public int getOvertime () {
        return overtime;
    }

    public void setOvertimeSalary (double overtimeSalary) {
        this.overtimeSalary = overtimeSalary;
    }

    public double getOvertimeSalary () {
        return overtimeSalary;
    }

    public double getSalary (int overtime, double overtimeSalary) {
        return super.getSalary() + (overtime * overtimeSalary);
    }

    public double getSalary () {
        return super.getSalary() + (overtime * overtimeSalary);
    }

    public void lihatInfo() {
        System.out.println("Employee ID: " + this.getEmployeeId());
        System.out.println("Name: " + this.getName());
        System.out.println("Group: " + this.getGroup());
        System.out.println("Overtime amount: " + this.getOvertime());
        System.out.printf("Overtime salary: %.0f\n", this.getOvertimeSalary());
        System.out.printf("Salary: %.0f\n", this.getSalary());
    }
}
