public class TestPatrolRobot {
    public static void main(String[] args) throws Exception {
        Battery batt = new Battery();
        PatrolRobot pr = new PatrolRobot("ASIMO", 2048, 150, new Battery(1600));
        pr.increasePower();

        System.out.println("Name: " + pr.name);
        // PATROL <NIM> ASIMO
        System.out.println("CPUSpeed: " + pr.CPUSpeed);
        System.out.println("Power: " + pr.Power);

        // add code to show battery capacity using pr object
        System.out.println("Battery Capacity: " + pr.RobotBattery.Capacity);
    }
}
