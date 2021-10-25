public class Cat extends Animal{

    public Cat(boolean sleeps, boolean eats, boolean speaks, String voice){
        super(sleeps, eats, speaks, voice);
    }

    @Override
    public void voice() {
        System.out.println("meow");
    }
}
