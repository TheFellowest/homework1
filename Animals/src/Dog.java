public class Dog extends Animal{

    public Dog(boolean sleeps, boolean eats, boolean speaks, String voice) {
        super(sleeps, eats, speaks, voice);
    }

    @Override
    public void voice() {
        System.out.println("woof");
    }
}
