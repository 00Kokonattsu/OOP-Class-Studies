public class Bachelor extends College_Student implements Achievement, Cumlaude {
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

    @Override 
    public void winningCompetition () {
        System.out.println("I have won an INTERNATIONAL competition");
    }

    @Override
    public void makingScientificPublication () {
        System.out.println("I have published in an INTERNATIONAL journal");
    }
}
