public class Master extends College_Student implements Cumlaude {
    public Master (String name) {
        super(name);
    }

    @Override 
    public void graduate () {
        System.out.println("I have completed my MASTER'S THESIS");
    }
    
    public void reachHighGPA () {
        System.out.println("My GPA is above 3.71");
    }
}
