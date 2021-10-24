public class Main {
    public static void main(String[] args) {
        Cat snowball = new Cat(true, true, true, "meow");
        snowball.setEats(true);
        snowball.setSleeps(true);
        snowball.setSpeaks(true);

        Dog berserk = new Dog(true, true, true, "woof");
        berserk.setEats(true);
        berserk.setSleeps(false);
        berserk.setSpeaks(true);

        Frog jafar = new Frog(true, true, true, "ribbit");
        jafar.setSleeps(true);
        jafar.setEats(true);
        jafar.setSpeaks(true);

    }
}
