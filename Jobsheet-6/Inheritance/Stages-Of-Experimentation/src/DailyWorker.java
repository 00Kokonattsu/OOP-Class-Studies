public class DailyWorker extends Staff {
    public int amountWorkingHours;

    public DailyWorker() {

    }

    public DailyWorker(String name, String address, String gender, int age, int salary, int overtime, int deduction, int amountWorkingHours) {
        super(name, address, gender, age, salary, overtime, deduction);
        this.amountWorkingHours = amountWorkingHours;
    }

    public void showDailyWorker() {
        System.out.println("======Daily Worker Data======");
        super.showStaffData();
        System.out.println("Amount of Working Hours: " + amountWorkingHours);
        System.out.println("Net Salary: " + (salary*amountWorkingHours+overtime-deduction));
    }
}
