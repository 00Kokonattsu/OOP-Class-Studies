public class Bachelor extends College_Student implements Cumlaude {
    public Bachelor (String name) {
        super(name);
    }

    @Override
    public void graduate () {
        System.out.println("I have completed my UNDERGRADUATE THESIS");
    }

    @Override 
    public void reachHighGPA () {
        System.out.println("My GPA is above 3.51");
    }
}
