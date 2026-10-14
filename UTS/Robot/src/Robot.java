public class Robot {
    public String name;
    public int CPUSpeed, Power;

    public Robot (String name, int CPUSpeed, int Power) {
        this.name = name;
        this.CPUSpeed = CPUSpeed;
        this.Power = Power;
    }

    public void increasePower() {
        Power += 10;
    }

    public void reducePower () {
        Power -= 10;
    }
}