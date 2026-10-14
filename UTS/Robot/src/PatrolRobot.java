public class PatrolRobot extends Robot {
    public Battery RobotBattery;

    public PatrolRobot (String name, int CPUSpeed, int Power, Battery RobotBattery) {
        super(name, CPUSpeed, Power);
        this.RobotBattery = RobotBattery;
    }

    @Override 
    public void increasePower () {
        this.Power += 20;
    }
}
