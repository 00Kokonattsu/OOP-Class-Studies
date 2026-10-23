public class PatrolRobot extends Robot {
    public Battery RobotBattery;
    String nim = "254107020249";

    public PatrolRobot (String name, int CPUSpeed, int Power, Battery RobotBattery) {
        this.name = "Patrol " + nim + " " + name;
        this.CPUSpeed = CPUSpeed;
        this.Power = Power;
        this.RobotBattery = RobotBattery;
    }

    @Override 
    public void increasePower () {
        Power += 20;
    }
}
