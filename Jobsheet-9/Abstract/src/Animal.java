public abstract class Animal {
    protected int age;

    protected Animal () {
        this.age = 0;
    }

    public void addAge () {
        this.age++;
    }

    public abstract void moving ();
}