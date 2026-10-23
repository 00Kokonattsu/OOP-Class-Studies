public class College_Student {
    protected String name;

    public College_Student (String name) {
        this.name = name;
    }

    public void classOnCampus() {
        System.out.println("I am a student, my name is " + this.name);
        System.out.println("I attend classes on campus.");
    }
}
