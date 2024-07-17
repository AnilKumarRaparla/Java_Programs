public abstract class Anilmal {
    protected String name;

    public Anilmal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public void eat() {
        System.out.println(name + " is eating.");
    }
}
