public class Frog extends Animal{

    public Frog(boolean sleeps, boolean eats, boolean speaks, String voice){
        super(sleeps, eats, speaks, voice);
    }

    @Override
    public void voice() {
        System.out.println("ribbit");
    }
}
