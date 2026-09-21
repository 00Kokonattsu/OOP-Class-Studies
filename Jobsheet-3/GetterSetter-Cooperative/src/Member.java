public class Member {
    private String name, address;
    private float savings;

    Member(String name, String address){
        this.name = name;
        this.address = address;
        this.savings = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlamat(String address){
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public float getSavings(){
        return savings;
    }

    public void deposit(float uang) {
        savings += uang;
    }

    public void withdraw(float uang) {
        savings -= uang;
    }
}
