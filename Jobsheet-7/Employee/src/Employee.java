public class Employee {
    private String name, employeeId, group;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setGroup(String group) {
        this.group = group;

        switch (group.charAt(0)) {
            case 1: this.salary = 5000000;
                break;
            case 2: this.salary = 3000000;
                break;
            case 3: this.salary = 2000000;
                break;
            case 4: this.salary = 1000000;
                break;
            case 5: this.salary = 750000;
                break;
        }
    }

    public String getName () {
        return name;
    }

    public String getEmployeeId () {
        return employeeId;
    }

    public String getGroup () {
        return group;
    }

    public double getSalary () {
        return salary;
    }
}
